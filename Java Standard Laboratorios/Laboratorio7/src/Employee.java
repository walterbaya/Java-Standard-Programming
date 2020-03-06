
public class Employee {
	private String name;
	private String identifier;
	private int age;

	/** remember: constructor's name should be same as class' name */

	public Employee(String name, String identifier, int age) {
		this.name = name;
		this.age = age;
		this.identifier = identifier;
	}

	public void showEmployeeData() {
		System.out.println("his/her name is: " + this.name + " his/her age is: " + this.age
				+ " and his/her identifier is: " + this.identifier);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
