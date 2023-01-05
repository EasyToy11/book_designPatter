package abstractFactory.factory;

public abstract class Item {
	protected String caption;

	// abstractでコンストラクタの定義は出来ない
	// 今回は実装まで行っているため、継承可能
	public Item(String caption) {
		this.caption = caption; 
	}
	public abstract String makeHTML();
}
