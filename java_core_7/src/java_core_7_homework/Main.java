package java_core_7_homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Option1 option1 = new Option1();
		Option2 option2 = new Option2();
		Option3 option3 = new Option3();
		Option4 option4 = new Option4();
		Option5 option5 = new Option5();
		Option6 option6 = new Option6();
		Option7 option7 = new Option7();
		
		int user = 3;
		int exit = 8;
		Scanner scanner = new Scanner(System.in);
	
		

		
		do{
			System.out.println("press 1 for check the month");
			System.out.println("press 2 for all simular month");
			System.out.println("press 3 for syso next season");
			System.out.println("press 4 for the previous month");
			System.out.println("press 5 for show all months with even days");
			System.out.println("press 6 for show all months of odd days");
			System.out.println("press 7 for input any month");
			user  = scanner.nextInt();
			switch (user) {
			case 1:
				option1.option_1();
				break;

			case 2:
				option2.option_2();
				break;
				
			case 3:
				option3.option_3();
				break;
				
			case 4:
				option4.option_4();
				break;
			case 5:
				option5.option_5();
				break;
				
			case 6:
				option6.option_6();
				break;
			case 7:
				option7.option_7();
				break;
			}
			
		
		
		
		}while(user!=exit);
		System.out.println("exit");
		
			
	}

}
