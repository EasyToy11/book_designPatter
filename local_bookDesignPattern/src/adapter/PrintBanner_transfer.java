package adapter;

public class PrintBanner_transfer extends Print_transfer{
	public Banner banner;
	
	public PrintBanner_transfer(String string) {
		this.banner = new Banner(string);
	}
	
	@Override
	public void printWeak() {
		banner.showWithParen();
		
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
		
	}
	
}
