package factorymethod;

public class ConcreteCreatorA implements Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}

}
