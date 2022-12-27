package Builder;

import java.lang.management.MemoryUsage;
import java.nio.file.DirectoryIteratorException;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Main {
	public static void main(String[] args) {
		if(args.length != 1) {
			usage();
			System.exit(0);
		}
		if(args[0].equals("text")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.constract();
			String result = textBuilder.getTextResult();
			System.out.println(result);
		}
		else if(args[0].equals("html")) {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.constract();
			String filename = htmlBuilder.getHTMLResult();
			System.out.println("HTMLファイル" + filename + "が作成されました。");
		}else {
			usage();
			System.exit(0);
		}
	}
	
	public static void usage() {
		System.out.println("Usage java Main text    テキストで文章作成");
		System.out.println("Usage java Main html    HTMLで文章作成");
	}

}
