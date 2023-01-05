package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idcard.IDCardFactory;
import factoryMethod.idcard.MyCardFactory;


public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Factory myFactory = new MyCardFactory();
		Product card1 = factory.create("Hiroshi Yuki");
		Product card2 = factory.create("Tomura");
		Product card3 = factory.create("Hanako Sato");
		Product card4 = myFactory.create("EasyToy11");
		card1.use();
		card2.use();
		card3.use();
		card4.use();
	}

}
