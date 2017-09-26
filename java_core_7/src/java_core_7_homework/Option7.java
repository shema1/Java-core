package java_core_7_homework;

import java.util.Scanner;

public class Option7 {
	

	public void option_7(){
		
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
				if(month.getDays()%2 == 0){
					System.out.println("parnuy");
					
				}else{
					System.out.println("neparnuy");
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
