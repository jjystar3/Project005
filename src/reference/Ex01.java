package reference;

public class Ex01 {

	public static void main(String[] args) {
		
		Subject math = new Subject("수학", 85);
		Subject korean = new Subject("국어", 100);
		
		Student student = new Student(1001, "둘리", math , korean);
		
	}

}

// 학생 클래스
class Student {
	int studentID;
	String studentName;
	Subject math;
	Subject korean;
	
	public Student(int studentID, String studentName, Subject math, Subject korean) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}
}

// 성적 클래스
class Subject {
	String subjectName;
	int scorePoint;
	
	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
}