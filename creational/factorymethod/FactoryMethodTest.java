package factorymethod;

public class FactoryMethodTest {

	private Creator[] creators;

	public FactoryMethodTest(Creator[] c) {
		super();
		this.creators = c;
	}

	public void createAndUseProducts(){
        System.out.println("Created Products:");
        for(Creator creator: creators){
                Product product = creator.factoryMethod();
                System.out.println(product.who());
        }

	}

	public static void main(String[] args) {
        Creator[] creators = new Creator[2];

        creators[0] = new ConcreteCreatorA();
        creators[1] = new ConcreteCreatorB();

        FactoryMethodTest test = new FactoryMethodTest(creators);
        test.createAndUseProducts();

	}

}
