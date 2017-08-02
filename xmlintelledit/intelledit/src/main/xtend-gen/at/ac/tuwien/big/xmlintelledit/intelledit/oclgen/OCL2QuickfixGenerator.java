package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBasedQuickfixDefinition;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OclExtractor;
import java.io.File;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class OCL2QuickfixGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    final String ecorePackageName = "at.ac.tuwien.big.forms";
    final String packageName = (ecorePackageName + ".form.ui.quickfix.ocl");
    final String validatorPackageName = (ecorePackageName + ".form.validation.ocl");
    final List<OCLBasedQuickfixDefinition> quickfixableOclExpressions = OclExtractor.getQuickfixableOCLExpressions(resource);
    final String fileName = "FormQuickfixProvider";
    String _replaceAll = packageName.replaceAll("\\.", "\\/");
    String _plus = (_replaceAll + "/");
    String _plus_1 = (_plus + fileName);
    String _plus_2 = (_plus_1 + ".java");
    final File file = new File(_plus_2);
    String _string = file.toString();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.editor.quickfix.Fix;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.validation.Issue;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2QuickfixSupport;");
    _builder.newLine();
    _builder.append("import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBasedValidationQuickfix;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(fileName);
    _builder.append(" extends org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      for(final OCLBasedQuickfixDefinition entry : quickfixableOclExpressions) {
        _builder.append("\t");
        _builder.append("@Fix(");
        _builder.append(validatorPackageName, "\t");
        _builder.append(".");
        String _validatorClassName = entry.getValidatorClassName();
        _builder.append(_validatorClassName, "\t");
        _builder.append(".");
        String _upperCase = entry.getConstraintName().toUpperCase();
        _builder.append(_upperCase, "\t");
        _builder.append("_ISSUE_KEY)");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public void fixIssue");
        String _constraintName = entry.getConstraintName();
        _builder.append(_constraintName, "\t");
        _builder.append("(Issue issue, IssueResolutionAcceptor acceptor) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("for (String userData : issue.getData()) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("final OCLBasedValidationQuickfix quickFix = OCL2QuickfixSupport.fromString(userData);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("acceptor.accept(issue, quickFix.getName(), quickFix.getDescription(), quickFix.getImage(), (EObject element, IModificationContext context) -> {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("((");
        _builder.append(ecorePackageName, "\t\t\t\t");
        _builder.append(".");
        String _name = entry.getElementClass().getName();
        _builder.append(_name, "\t\t\t\t");
        _builder.append(") element).set");
        String _firstUpper = StringExtensions.toFirstUpper(entry.getTargetAttribute().getName());
        _builder.append(_firstUpper, "\t\t\t\t");
        _builder.append("((");
        String _instanceClassName = entry.getTargetAttribute().getEAttributeType().getInstanceClassName();
        _builder.append(_instanceClassName, "\t\t\t\t");
        _builder.append(") quickFix.getValue());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("});");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_string, _builder);
  }
}
