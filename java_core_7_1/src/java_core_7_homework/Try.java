package java_core_7_homework;

import java.util.Scanner;

public class Try {
	
	String name;
	
	
	public void blabla(){
		Month[] months = Month.values();

		Month month = months[0];
		boolean exist = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter some month");
		
		String userMonth = scanner.next();
		
		for (int i = 0; i < months.length; i++) {
			
			if(userMonth.equalsIgnoreCase(months[i].name())){
				
				month = months[i];
				if(month.getSeason().equals(Season.SPRING)){
					System.out.println( "march april may");
					
				}
				if(month.getSeason().equals(Season.SUMMER)){
					System.out.println( "june julay agust");
					
				}
				
				if(month.getSeason().equals(Season.AUTUMN)){
					System.out.println( "september octouber november");
					
				}
				
				if(month.getSeason().equals(Season.WINTER)){
					System.out.println( "december junuary february");
					
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
