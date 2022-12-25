package adapter;

public class Main {

	public static void main(String[] args) {
		// 継承
		Print_extend p_extend = new PrintBanner_extend("extend");
		p_extend.printWeak();
		p_extend.printStrong();
		
		System.out.println("");

		// 委譲
		Print_transfer p_transfer = new PrintBanner_transfer("transfer");
		p_transfer.printWeak();
		p_transfer.printStrong();
		
	}

}
