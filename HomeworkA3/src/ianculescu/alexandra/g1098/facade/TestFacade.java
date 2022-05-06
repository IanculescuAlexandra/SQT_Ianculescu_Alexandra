package ianculescu.alexandra.g1098.facade;

import ianculescu.alexandra.g1098.adapter.TestAdapter;
import ianculescu.alexandra.g1098.builder.TestBuilder;
import ianculescu.alexandra.g1098.composite.TestComposite;
import ianculescu.alexandra.g1098.decorator.TestDecorator;
import ianculescu.alexandra.g1098.factorymethod.TestFactoryMethod;
import ianculescu.alexandra.g1098.prototype.TestPrototype;
import ianculescu.alexandra.g1098.simplefactory.TestSimpleFactory;
import ianculescu.alexandra.g1098.singleton.TestSingleton;

public class TestFacade {
	TestSingleton testSingleton = new TestSingleton();
	TestBuilder testBuilder = new TestBuilder();
	TestPrototype testPrototype = new TestPrototype();
	TestSimpleFactory testSimpleFactory = new TestSimpleFactory();
	TestFactoryMethod testFactoryMethod = new TestFactoryMethod();
	TestDecorator testDecorator = new TestDecorator();
	TestComposite testComposite = new TestComposite();
	TestAdapter testAdapter = new TestAdapter();
	
	public void test() {
		System.out.println("Singleton");
		testSingleton.test();
		System.out.println("Builder");
		testBuilder.test();
		System.out.println("Prototype");
		testPrototype.test();
		System.out.println("TestSimpleFactory");
		testSimpleFactory.test();
		System.out.println("TestFactoryMethod");
		testFactoryMethod.test();
		System.out.println("TestDecorator");
		testDecorator.test();
		System.out.println("TestComposite");
		testComposite.test();
		System.out.println("TestAdapter");
		testAdapter.test();
		System.out.println("Test Facade - We test them all with it");
	}
}
