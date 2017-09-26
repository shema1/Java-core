package java_core_9__homework;

import java.util.ArrayList;
import java.util.Scanner;

import test2.Man;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Deputat deputat = new Deputat(80, 180, "Anton", "blabla", 32, true);
		Fraction fraction = new Fraction();
	
		
//		ArrayList<Human> cats = new ArrayList<>();
//		
//		cats.add(deputat);
	
	
		
		int user =0;
		int exit =6;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Натисніть 1 щоб додати депутата");
			System.out.println("Натисніть 2 щоб видалити депутата");
			System.out.println("Натисніть 3 щоб показати хабарників");
			System.out.println("Натисніть 4 щоб показати всіх депутатів");
			System.out.println("Натисніть 5 щоб идалити всіх депутатів");
			
			user = sc.nextInt();
			switch (user) {
			case 1:
				fraction.addDeputat();
				break;
			case 2:
				fraction.delDeputat();
				break;
				
			case 3:
				fraction.viewHabar();
				break;
				
			case 4:
				System.out.println(fraction.deputats);
				break;
				
			case 5:
				fraction.delAll();
				break;
	

			}
		
		}while(user!=exit);		
		
	}

}
