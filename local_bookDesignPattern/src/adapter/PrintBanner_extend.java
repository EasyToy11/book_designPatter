package adapter;

public class PrintBanner_extend extends Banner implements Print_extend {
	public PrintBanner_extend(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
		
	}

	@Override
	public void printStrong() {
		showWithAster();
		
	}
	
}
