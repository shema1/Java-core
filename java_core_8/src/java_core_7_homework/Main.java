package java_core_7_homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Option1 option = new Option1();
		int user = 3;
		int exit = 3;
		Scanner scanner = new Scanner(System.in);
		
		int i =0;
		
		System.out.println("enter");
		do{
			user  = scanner.nextInt();
			switch (user) {
			case 1:
				option.option_1();
				break;

			case 2:
				option.option_2();
				break;
			}
		
		
		
		}while(user!=exit);
		System.out.println("exit");
	}

}
