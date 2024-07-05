package reference;

public class Quiz01 {

	public static void main(String[] args) {
		
		Book book1 = new Book("java", 15000, "a", 100);
		Book book2 = new Book("HTML", 25000, "b", 200);
		Book book3 = new Book("CSS", 20000, "c", 150);
		
		Member member = new Member(1234, "홍길동", book1, book2, book3);
		
	}

}

class Member {
	
	int memberNum;
	String memberName;
	Book book1;
	Book book2;
	Book book3;
	
	public Member(int memberNum, String memberName, Book book1, Book book2, Book book3) {
		super();
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
		
}

class Book {
	
	String title;
	int price;
	String publisher;
	int pageCount;
	
	public Book(String title, int price, String publisher, int pageCount) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.pageCount = pageCount;
	}
		
}