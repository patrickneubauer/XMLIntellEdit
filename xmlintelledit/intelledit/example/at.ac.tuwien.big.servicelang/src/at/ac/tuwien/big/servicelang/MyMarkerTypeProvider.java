package at.ac.tuwien.big.servicelang;

import org.eclipse.xtext.ui.validation.LanguageAwareMarkerTypeProvider2;

import com.google.inject.Singleton;

@Singleton
public class MyMarkerTypeProvider extends LanguageAwareMarkerTypeProvider2 {

	{
		System.out.println("I am here!");
	}
}
