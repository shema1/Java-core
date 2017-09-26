package java_core_3_homework;

public class Life {
	
	
	public Life(){
		
	}
	House house = new House("Big house");
	Baby baby = new Baby("Tanya", "Shymechko" );
	Marriage marriage = new Marriage(0);
	Woman woman = new Woman("Olena", "Petrova");
	Job job = new Job(1000, "driver");
	Man man = new Man("Mykola", "Shymechko", new Cash(1000),20);

	
	public void checkmoney(){
	if(man.cash.money>10000 ){
		System.out.println("you rich");
	}
	else{
		System.out.println("you need work");
	}
	
	}
	
	public void checkwork(){
		if(man.job==null){
			man.setJob(job);
		}else{
			System.out.println("bla-bla");
		}
		
	}
	
	public void salary1(){
		if (man.job!=null){
			
		int a = man.cash.money + job.salary;
		man.setCash(new Cash(a));
		System.out.println(" now i have"+ a);
		}else{
			System.out.println("no work no salary");
		}
		
		
	}
	public void wife(){
		if(man.age<23){
			System.out.println("you dont need wife");
		}else{
			man.setWoman(woman);
			man.setMarriage(marriage);
		}
	}
	
	public void marriage1(){
		if(man.marriage.marriage1>2){
			man.setBaby(baby);
		}
	}
	
 public void house1(){
	 if (man.house==null){
		 man.setHouse(house);
	 }
 }

	
	
	public void age1(){
		if(man.age<=25){
			
			man.age++;
			man.marriage.marriage1++;
		}
	}
	
	
		
	
	

}
