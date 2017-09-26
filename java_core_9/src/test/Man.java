package test;

public class Man  extends Human {
	
	String name;
	int age;
	
	public Man(int weight, String name, int age) {
		super(weight);
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + "]";
	}
	
	

}
