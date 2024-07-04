package instance;

public class Ex01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Student student = new Student();
		
		// 객체의 멤버변수를 사용하여 학번 수정
		student.studentID = 1001;
		student.studentName = "홍길동";
		student.grade = 3;
		student.address = "인천광역시";
		
		System.out.println("학생의 모든 정보를 출력합니다.");
//		System.out.println("studentID = " + student.studentID);
//		System.out.println("studentName = " + student.studentName);
//		System.out.println("grade = " + student.grade);
//		System.out.println("address = " + student.address);
		
		student.showStudentInfo();

		System.out.println("객체의 주소:" + student);
		
	}

}
