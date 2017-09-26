package java_core_7_homework;

public class Option6 {
	
	public void option_6(){
		Month[] months = Month.values();

		
	
		
		
	
		
		
		
		for (int i = 0; i < months.length; i++) {
			if(months[i].getDays()%2 > 0){
				System.out.println(months[i]);
			}
		}
	}

}
