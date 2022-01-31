package code.java8.common;

public class Employee {
	private final String name;
	private final int age;
	private final Address address;

	public Employee(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public Address getAddress() throws CloneNotSupportedException {
		return (Address) this.address.clone();
	}

	@Override
	public String toString() {
		return "[" + this.name + "," + this.age + "," + this.address.toString() + "]";
	}
}