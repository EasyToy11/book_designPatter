package Builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void constract() {
		builder.makeTitle("Greething");
		builder.makeString("一般的なあいさつ");
		builder.makeItems(new String[] {
			"How are you?",
			"Hello,",
			"Hi.*",
		});
		
		builder.makeString("状況に応じたあいさつ");
		builder.makeItems(new String[] {
			"Good morning",
			"Good afternoon",
			"Good evening.*",
		});
		builder.close();
		
	}
	

}
