package java_core_14_homework;

public class Tank {
	
	private int id;
	private int age;
	private	String name;
	private String type;
	private String country;
	
	
	public Tank(int id, int age, String name, String type, String country) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.type = type;
		this.country = country;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}



	@Override
	public String toString() {
		return "Tank [id=" + id + ", age=" + age + ", name=" + name + ", type=" + type + ", country=" + country + "]";
	}
	
	
	
	

}
