package java_core_4_homework;

public class Hunter {
	
	private String name;
	private String surename;
	private int age;
	 Weapon weapon;
	private Armor armor;
	
	
	
	public Hunter(String name, String surename, int age) {
		super();
		this.name = name;
		this.surename = surename;
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
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public Armor getArmor() {
		return armor;
	}
	public void setArmor(Armor armor) {
		this.armor = armor;
	}

}
