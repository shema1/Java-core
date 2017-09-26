package java_core_12_homework;

public class Human {
	
	private int age;
	private int weight;
	private int height;
	
	public Human(int age, int weight, int height) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Human [age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
}
