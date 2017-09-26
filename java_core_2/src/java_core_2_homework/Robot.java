package java_core_2_homework;

public class Robot {
	
	
	 CoffeRobot cofferobot ;
	 RobotCoocker robotcoocker;
	 RobotDancer robotdancer;
	
	 
	public Robot(CoffeRobot cofferobot, RobotCoocker robotcoocker, RobotDancer robotdancer) {
		super();
		this.cofferobot = cofferobot;
		this.robotcoocker = robotcoocker;
		this.robotdancer = robotdancer;
	}


	public void work(){
		System.out.println("i just work");
		
	}

}
