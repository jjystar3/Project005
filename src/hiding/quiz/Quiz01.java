package hiding.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book();

		book1.setTitle("자바프로그패밍");
		book1.setPrice(20000);
		book1.setPublisher("한빛컴퍼니");
		book1.setPage(300);

		book2.setTitle("스프링");
		book2.setPrice(15000);
		book2.setPublisher("한빛컴퍼니");
		book2.setPage(500);

		System.out.println("제목:" + book1.getTitle() + " 가격:" + book1.getPrice() + " 출판사:" + book1.getPublisher()	+ " 페이지 수:" + book1.getPage());
		System.out.println("제목:" + book2.getTitle() + " 가격:" + book2.getPrice() + " 출판사:" + book2.getPublisher()	+ " 페이지 수:" + book2.getPage());
	}

}

class Book {
	private String title;
	private int price;
	private String publisher;
	private int page;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

}