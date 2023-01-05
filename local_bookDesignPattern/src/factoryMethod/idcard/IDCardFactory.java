package factoryMethod.idcard;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;

public class IDCardFactory extends Factory {
	private int serial = 100;
	
	public IDCardFactory() {
		
	};
	
	@Override
	public Product createProduct(String owner) {
		return new IDCard(owner,serial++);
	}
	
	@Override
	public void registerProduct(Product product) {
		System.out.println(product + "を登録しました。\n");
	}
}
