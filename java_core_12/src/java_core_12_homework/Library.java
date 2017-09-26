package java_core_12_homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Library {
	
	Map<Author, Book> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	public void addAuthor(){
		System.out.println("Input name");
		String name = sc.nextLine();
		System.out.println("Input surename");
		String surename = sc.nextLine();
		System.out.println("Input age");
		int age = sc.nextInt();
		System.out.println("Input weight");
		int weight = sc.nextInt();
		System.out.println("Input height");
		int height = sc.nextInt();
		
		map.put(new Author(age, weight, height, name, surename), new Book());
	}
	
	public void addbook(){
		
		System.out.println("Input name book");
		String namebook = sc.nextLine();
		System.out.println("Input age book");
		int agebook = sc.nextInt();
		System.out.println("Input page");
		int page = sc.nextInt();
		
		System.out.println("input name author");
		String nameauthor =  sc.nextLine();
		
		Set<Entry<Author, Book>> setMap = map.entrySet();
		Iterator<Entry<Author, Book>> iter =  setMap.iterator();
		
		while (iter.hasNext()){
			Entry<Author, Book> temp = iter.next();
			if(temp.getKey().getName().equals(nameauthor)){
				((Map<Author, Book>) temp.getValue()).remove(new Book(namebook, agebook, page));
			}
		}
		
	}
	
	
	public void showall(){

		Set<Entry<Author, Book>> setMap = map.entrySet();
		Iterator <Entry<Author, Book>> iter = setMap.iterator();
		while (iter.hasNext()){
			Entry <Author, Book> temp = iter.next();
			System.out.println(temp);
		}
		
	

	}
	
	

}
