package java_core_7_homework;

import java.util.Scanner;

public class Option3 {
	
	
	public void option_3(){
		Month[] months = Month.values();
		Season[] seasons = Season.values();
		Month month = months[0];
		boolean exist = false;
		Season season = seasons[0];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter some month");
		
		String userMonth = scanner.next();
		
		for (int i = 0; i < months.length; i++) {
			
			if(userMonth.equalsIgnoreCase(months[i].name())){
				
				month = months[i];
				season = month.getSeason();
				System.out.println(season.values()[season.ordinal()+1]);
				
			
				exist = true;
				break;
			}
			
		}

		if(exist == false){
			System.out.println("No this month try again");
		}
		
		
	}
}
