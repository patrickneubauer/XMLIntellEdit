package mypackage;

import junit.framework.TestCase;

import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.MembersInjector;
import com.google.inject.Provider;

public class GuiceExample extends TestCase {

	private static final C myFavouriteC = new C();	

	static class A<T> {
		@Inject
		B b;
		@Inject
		T t;

		@Inject
		void doNothing() {
		}
	}

	static class B {
		@Inject
		C c;

		@Inject
		void doNothing() {
		}
	}
	
	static class D {
		@Inject
		Provider<C> cProvider;
		
		@Inject
		void doNothing() {			
		}
	}

	static class C {
	}

	public void testLookupMembersInjectorBinding() {
		Injector injector = Guice.createInjector(new AbstractModule() {
			protected void configure() {
				bind(C.class).toInstance(myFavouriteC);
			}
		});
		MembersInjector<A<C>> membersInjector = injector.getInstance(new Key<MembersInjector<A<C>>>() {
		});

		A<C> a = new A<C>();
		membersInjector.injectMembers(a);
		// assertSame(myFavouriteC, a.t);
		// assertSame(myFavouriteC, a.b.c);

		// assertEquals("MembersInjector<java.lang.String>",
		// injector.getInstance(new Key<MembersInjector<String>>()
		// {}).toString());
		String membersInjectorString = injector.getInstance(new Key<MembersInjector<String>>() {
		}).toString();
		System.out.println(membersInjectorString);

	}
	
	public void testMembersInjectorBinding() {
		Injector injector = Guice.createInjector(new AbstractModule() {
			protected void configure() {
				bind(C.class).toInstance(myFavouriteC);
			}
		});
		MembersInjector<B> membersInjector = injector.getInstance(new Key<MembersInjector<B>>() {
		});
		
		B b = new B();
		membersInjector.injectMembers(b);
		System.out.println("");
		
	}
	
	public void testMembersInjectorBindingProvider() {
		Injector injector = Guice.createInjector(new AbstractModule() {
			protected void configure() {
				bind(C.class).toInstance(myFavouriteC);
			}
		});
		MembersInjector<D> membersInjector = injector.getInstance(new Key<MembersInjector<D>>() {
		});
		
		D d = new D();
		membersInjector.injectMembers(d);
		System.out.println("");
		
	}
	

}
