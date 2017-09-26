package java_core_11_homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ZooClub zoo = new ZooClub();
		Scanner sc = new Scanner (System.in);
		
		int user = 0;
		
		
		do{
			System.out.println("enter 1 for add person");
			user = sc.nextInt();
			switch (user) {
			case 1:
				zoo.addPerson();
				
				break;
			case 2:
				zoo.addpet();
				break;
			case 3:
				zoo.showall();

			default:
				break;
			}
			
		}while(user!=3);
	}
}
