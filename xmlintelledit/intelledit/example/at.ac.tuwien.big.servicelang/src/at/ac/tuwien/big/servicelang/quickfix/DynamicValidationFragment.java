package at.ac.tuwien.big.servicelang.quickfix;

import java.lang.reflect.Field;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.validation.ValidatorFragment;
import org.eclipse.xtext.generator.validation.ValidatorNaming;

import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicValidator;

public class DynamicValidationFragment extends ValidatorFragment {
	
	public static class FakeValidatorNaming extends ValidatorNaming {
		private ValidatorNaming real;
		
		public FakeValidatorNaming(ValidatorNaming real) {
			this.real = real;
		}
		
		@Override
		public String getValidatorName(Grammar g) {
			return real.getValidatorName(g);
		}

		public String getAbstractValidatorName() {
			return real.getAbstractValidatorName();
		}
		
		public String getValidatorSuperClassName(boolean isInheritImplementation) {
			return DynamicValidator.class.getCanonicalName();
		}
			
		public String getGeneratedEPackageName(EPackage pack) {
			return real.getGeneratedEPackageName(pack);
		}
	}
	
	{
		Thread t = new Thread(()->{
			Field f;
			try {
				f = ValidatorFragment.class.getDeclaredField("_validatorNaming");
				f.setAccessible(true);
				for(;;) {
					Object o = f.get(DynamicValidationFragment.this);
					if (o != null) {
						f.set(DynamicValidationFragment.this,new FakeValidatorNaming((ValidatorNaming)o));
					}
					Thread.sleep(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		t.start();
		System.out.println("Bla");
	}

}
