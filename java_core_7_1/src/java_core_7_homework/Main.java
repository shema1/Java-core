package java_core_7_homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Month[] months = Month.values();

		Month month = months[0];
		boolean exist = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter some month");
		
		String userMonth = scanner.next();
		
		for (int i = 0; i < months.length; i++) {
			
			if(userMonth.equalsIgnoreCase(months[i].name())){
				
				month = months[i];
				if(month.equals(months[i].getDays())){
					System.out.println( "sdfg");
					
				}
			
				exist = true;
				break;
			}
			
		}
		

		if(exist == false){
			System.out.println("No this month try again");
		}
		
		
	
			
	}

}
