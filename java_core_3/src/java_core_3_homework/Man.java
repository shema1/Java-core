package java_core_3_homework;

public class Man {
	
	String name;
	String surename;
	int age;
	Job job;
	Cash cash;
	Woman woman;
	Marriage marriage;
	Baby baby;
	House house;
	
	public House getHouse() {
		return house;
	}




	public void setHouse(House house) {
		this.house = house;
	}




	public Baby getBaby() {
		return baby;
	}




	public void setBaby(Baby baby) {
		this.baby = baby;
	}




	public Marriage getMarriage() {
		return marriage;
	}




	public void setMarriage(Marriage marriage) {
		this.marriage = marriage;
	}




	public Woman getWoman() {
		return woman;
	}




	public void setWoman(Woman woman) {
		this.woman = woman;
	}




	public Man(String name, String surename, Cash cash, int age) {
		super();
		this.name = name;
		this.surename = surename;
		this.cash = cash;
		this.age = age;
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




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public Job getJob() {
		return job;
	}




	public void setJob(Job job) {
		this.job = job;
	}




	public Cash getCash() {
		return cash;
	}




	public void setCash(Cash cash) {
		this.cash = cash;
	}




	@Override
	public String toString() {
		return "Man [name=" + name + ", surename=" + surename + ", age=" + age + ", job=" + job + ", cash=" + cash
				+ "]";
	}
	

	
	
	
	
}
