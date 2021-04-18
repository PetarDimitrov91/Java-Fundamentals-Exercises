package Students2;

public class Student2 {
	private String firstName;
	private String lastName;
	private int age;
	private String hometown;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Student2(String firstName, String lastName, int age, String hometown) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.hometown = hometown;
	}

	public String getHometown() {
		return this.hometown;
	}

	public void setCity(String city) {
		this.hometown = city;
	}
}

