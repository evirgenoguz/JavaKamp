package gun3Odev2;

import java.util.List;

public class Student  extends User{
	
	private String studentNo;
	private List<String> lessons;

	
	public Student(int id, String name, String lastName, String email, String password, String studentNo) {
		super(id, name, lastName, email, password);
		this.studentNo = studentNo;
	}


	public String getStudentNo() {
		return studentNo;
	}


	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}


	public List<String> getLessons() {
		return lessons;
	}


	public void setLessons(List<String> lessons) {
		this.lessons = lessons;
	}
	
	
	
	
}
