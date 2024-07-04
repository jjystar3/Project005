package instance;

public class Ex02 {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.studentID = 1001;
		student1.studentName = "홍길동";
		student1.grade = 3;
		student1.address = "인천";
		student1.showStudentInfo();
		System.out.println("객체의 주소는 " + student1 + " 입니다.");
		
		System.out.println();
		
		Student student2 = new Student();
		student2.studentID = 1002;
		student2.studentName = "이고은";
		student2.grade = 2;
		student2.address = "서울";
		student2.showStudentInfo();
		System.out.println("객체의 주소는 " + student2 + " 입니다.");
		
	}

}
