package set;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {

		HashSet<Book> library = new HashSet<>();
		
		Book book1 = new Book(1, "자바의 비밀 / ", 20000);
		Book book2 = new Book(1, "자바의 비밀 / ", 15000);
		Book book3 = new Book(1, "자바의 비밀 / ", 10000);
		Book book4 = new Book(1, "자바의 비밀 / ", 20000);
		
		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
		
		System.out.println(library);
		
		//HashSet은 중복을 파단하기 위해
		//1. hashCode() 반환값으로 비교
		//2. equals() 반환값으로 비교
	}

}
