package Strudents;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private String hometown;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Student(String firstName, String lastName, int age, String hometown) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.hometown = hometown;
	}

	public String getHometown(){
		return this.hometown;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String secondName) {
	}

	public void setAge(int age) {
	}
}
