package factoryMethod.idcard;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;

public class MyCardFactory extends Factory{

	@Override
	public Product createProduct(String owner) {
		return new MyCard(owner);
	}

	@Override
	public void registerProduct(Product product) {
		System.out.println("オリジナルの登録");
	}
	
}
