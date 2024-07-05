package constructor;

public class Quiz01 {

	public static void main(String[] args) {
		
		//객체 생성 후 초기화
		Book book1 = new Book();
		book1.title = "스프링부트";
		book1.price = 30000;
		book1.publisher = "한빛출판사";
		book1.pageNum = 200;
		
		//객체 생성과 동시에 초기화
		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300);
		
	}

}

class Book{
	String title;
	int price;
	String publisher;
	int pageNum;
	
	public Book() {
		super();
	}
	
	public Book(String title, int price, String publisher, int pageNum) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.pageNum = pageNum;
	}
}
