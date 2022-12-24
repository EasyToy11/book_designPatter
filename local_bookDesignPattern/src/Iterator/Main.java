package Iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinddereella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));

		// Iteratorを使う
		Iterator<Book> it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();
		
		// 拡張for文
		for(Book book:bookShelf) {
			System.out.println(book.getName());
		}
		System.out.println();
	}

}
