package java_core_11_homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {
	
	Map<Person, List<Animal>> map =  new HashMap<>();
	Scanner sc = new Scanner(System.in);
	public void addPerson(){
		System.out.println("Input name");
		String name = sc.nextLine();
		System.out.println("Input age");
		int age = sc.nextInt();
		map.put(new Person(name, age), null);
		//map.put(new Person("Mykola", 10), Arrays.asList(new Animal("Myrchik", "Cat")));
		
		
	}
	
	
	public void addpet(){
		System.out.println("We have participants");
		for (Entry<Person, List<Animal>> a : map.entrySet()) {
			int age1 = a.getKey().getAge();
			 String name1 = a.getKey().getName();
	          System.out.println(name1+" "+age1);
		}
		System.out.println("Select  participant that add pet");
		String name = sc.nextLine();
	
		for (Entry<Person, List<Animal>> b : map.entrySet()) {
			if(name.equals(b.getKey().getName())){
				System.out.println("Enter name pet");
				String name2 = sc.nextLine();
				System.out.println("Enter type pet");
				String type = sc.nextLine();
				
				//map.put(b,Arrays.asList(new Animal(name2, type)))
				//map.put(null, List<new Animal (name2, type)>)
				map.put(null, Arrays.asList(new Animal(name2, type)));
			}
		}
	}
	
	
	public void showall(){
		for (Entry<Person, List<Animal>> e : map.entrySet()) {
			
			int age1 = e.getKey().getAge();
			 String name1 = e.getKey().getName();
			 List<Animal> namepet = e.getValue();
		}
	}
	
	


}
