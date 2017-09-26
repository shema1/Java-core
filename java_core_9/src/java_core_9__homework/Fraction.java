package java_core_9__homework;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;


public class Fraction {
	
	ArrayList<Deputat> deputats = new ArrayList<>();
	
	String name;
	Fraction(){
		
	}
	
	
	
	public Fraction(ArrayList<Deputat> deputats, String name) {
		super();
		this.deputats = deputats;
		this.name = name;
	}

	
	


	public ArrayList<Deputat> getDeputats() {
		return deputats;
	}



	public void setDeputats(ArrayList<Deputat> deputats) {
		this.deputats = deputats;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void addDeputat(){
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Input name");
		String name = sc.nextLine();
		System.out.println("Input surename");
		String surename = sc.nextLine();
		System.out.println("input age");
		int age = sc.nextInt();
		System.out.println("input weight");
		int weight = sc.nextInt();
		System.out.println("input height");
		int height = sc.nextInt();
		System.out.println("чи бере хабар введ≥ть ");
		boolean habar = sc.hasNext();
		
		
		
		Deputat deputat = new Deputat(weight,height,name,surename,age, habar	);
		deputats.add(deputat);
		
	
		
		
	}
	
	public void delDeputat(){
		
	Scanner sc = new Scanner(System.in);
		System.out.println("у нас Ї "+ deputats.size()+"депутат≥в" );
		System.out.println("введ≥ть в≥д 0 до "+deputats.size()+ " ўоб зв≥льнити депутата" );
		int input = sc.nextInt();
		deputats.remove(input);
	}
	
	public void viewHabar(){
		
		for (int i = 0; i < deputats.size(); i++) {
		if(deputats.get(i).isHabar() == true){
			System.out.println(deputats.get(i));
		}
		
		}
		
	}
	
	public void delAll(){
		deputats.removeAll(deputats);
	}

}
