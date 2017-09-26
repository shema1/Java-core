package java_core_12_homework;


public class Author  extends Human{
	
	public Author(int age, int weight, int height) {
		super(age, weight, height);
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String surename;
	
	public Author(int age, int weight, int height, String name, String surename) {
		super(age, weight, height);
		this.name = name;
		this.surename = surename;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", surename=" + surename + "]";
	}
	
	
	
	
	

}
