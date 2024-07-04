package instance.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.title = "자바프로그래밍";
		book1.price = 20000;
		book1.publisher = "한빛컴퍼니";
		book1.pageCount = 300;
		book1.pringBookInfo();
		System.out.println("book1 메모리 주소:" + book1);

		System.out.println();
		
		Book book2 = new Book();
		book2.title = "스프링";
		book2.price = 15000;
		book2.publisher = "한빛컴퍼니";
		book2.pageCount = 500;
		book2.pringBookInfo();
		System.out.println("book2 메모리 주소:" + book2);
	}

}

class Book{
	
	String title;
	int price;
	String publisher;
	int pageCount;
	
	public void pringBookInfo() {
		System.out.println("제목:" + title + ", 가격:" + price + ", 출판사:" + publisher + ", 페이지수:" + pageCount);
	}
	
}
