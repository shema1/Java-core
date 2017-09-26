package java_core_9__homework;

import java.util.Scanner;

public class Deputat extends Human {
	
	private String name;
	private String surename;
	private int age;
	private boolean habar;
	private int sizehabar;
	
	public Deputat(int weight, int height, String name, String surename, int age, boolean habar) {
		super(weight, height);
		this.name = name;
		this.surename = surename;
		this.age = age;
		this.habar = habar;
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

	public boolean isHabar() {
		return habar;
	}

	public void setHabar(boolean habar) {
		this.habar = habar;
	}

	public int getSizehabar() {
		return sizehabar;
	}

	public void setSizehabar(int sizehabar) {
		this.sizehabar = sizehabar;
	}
	
	public void giveHabar(){
		if(isHabar()== false){
			System.out.println("Цей депутат не бере хабарів");
		}else{
			System.out.println("Введіть розмір хабаря");
			Scanner sc = new Scanner(System.in);
			int money = sc.nextInt();
			setSizehabar(money);
			
			
			if(money> 5000){
				System.out.println("Міліція увязнить депутата");
				setSizehabar(0);
			}
		}
	}

	@Override
	public String toString() {
		return "Deputat [name=" + name +", weight="+ weight +", height="+height + ", surename=" + surename + ", age=" + age + ", habar=" + habar + ", sizehabar="
				+ sizehabar + "]"  ;
	}
	

}
