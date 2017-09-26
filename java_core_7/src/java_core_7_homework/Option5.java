package java_core_7_homework;



public class Option5 {
	
	public void option_5(){
		Month[] months = Month.values();

		
	
		
		
	
		
		
		
		for (int i = 0; i < months.length; i++) {
			if(months[i].getDays()%2 == 0){
				System.out.println(months[i]);
			}
		}
	}

}
