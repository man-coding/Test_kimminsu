package main;

public class Quiz8 {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.title = "스프링부트";
		book1.price = 30000;
		book1.company = "한빛출판사";
		book1.page = 200;

		System.out.println(book1.title + "," + book1.price + "," + book1.company + "," + book1.page);
		System.out.println(book1);

		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300);

		System.out.println(book2.title + "," + book2.price + "," + book2.company + "," + book2.page);
		System.out.println(book2);

	}

}

class Book {

	String title;
	int price;
	String company;
	int page;

	public Book() {

	}

	public Book(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}

}