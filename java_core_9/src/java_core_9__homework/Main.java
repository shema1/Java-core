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
			System.out.println("�������� 1 ��� ������ ��������");
			System.out.println("�������� 2 ��� �������� ��������");
			System.out.println("�������� 3 ��� �������� ���������");
			System.out.println("�������� 4 ��� �������� ��� ��������");
			System.out.println("�������� 5 ��� ������� ��� ��������");
			
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
