package factoryMethod.idcard;

import factoryMethod.framework.Product;

public class MyCard extends Product{
	private String owner;
	
	public MyCard(String owner) {
		System.out.println("オリジナルカードを作ります。");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println("すごいことがおきるかも？");
	}
	
	public String getString() {
		return owner;
	}

}
