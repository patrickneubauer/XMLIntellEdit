package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class OCL2QuickfixGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		// TODO: This should be configurable
		val ecorePackageName = 'at.ac.tuwien.big.forms';
		val packageName = ecorePackageName + '.form.ui.quickfix.ocl';
		val validatorPackageName = ecorePackageName + '.form.validation.ocl';
		val quickfixableOclExpressions = OclExtractor.getQuickfixableOCLExpressions(resource);
		
		val fileName = 'FormQuickfixProvider';
		val file = new File(packageName.replaceAll("\\.", "\\/") + "/" + fileName + '.java');
		fsa.generateFile(file.toString,
		'''
				package «packageName»;
				
				import org.eclipse.emf.ecore.EObject;
				import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
				import org.eclipse.xtext.ui.editor.quickfix.Fix;
				import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
				import org.eclipse.xtext.validation.Issue;
				
				import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2QuickfixSupport;
				import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBasedValidationQuickfix;
				
				public class «fileName» extends org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider {
					
					«FOR entry : quickfixableOclExpressions»
						@Fix(«validatorPackageName».«entry.validatorClassName».«entry.constraintName.toUpperCase»_ISSUE_KEY)
						public void fixIssue«entry.constraintName»(Issue issue, IssueResolutionAcceptor acceptor) {
							for (String userData : issue.getData()) {
								final OCLBasedValidationQuickfix quickFix = OCL2QuickfixSupport.fromString(userData);
								acceptor.accept(issue, quickFix.getName(), quickFix.getDescription(), quickFix.getImage(), (EObject element, IModificationContext context) -> {
									((«ecorePackageName».«entry.elementClass.name») element).set«entry.targetAttribute.name.toFirstUpper»((«entry.targetAttribute.getEAttributeType.instanceClassName») quickFix.getValue());
								});
							}
						}
					«ENDFOR»
				}
			'''
		);
	}
}
