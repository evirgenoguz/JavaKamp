package gun3Odev2;

import java.util.List;

public class Instructor extends User{
	private String department;
	private List<String> lessons;

	public Instructor(int id, String name, String lastName, String email, String password, String department) {
		super(id, name, lastName, email, password);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<String> getLessons() {
		return lessons;
	}

	public void setLessons(List<String> lessons) {
		this.lessons = lessons;
	}
	
	
	
}
