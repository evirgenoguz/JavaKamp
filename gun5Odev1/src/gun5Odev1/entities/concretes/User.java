package gun5Odev1.entities.concretes;

import gun5Odev1.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String name; //en az 2 karakter
	private String lastName; //en az 2 karakter
	private String email; //regexle kontrol ve db de var m? kontrolu
	private String password; //en az 6 karakter
	
	public User(int id, String name, String lastName, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() < 6) {
			System.out.println("?ifre en az 6 karakterden olu?mal?d?r");
			return;
		}
		this.password = password;
	}
	
	
	
	
	
}
