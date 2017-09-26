package java_core_2_homework;

public class Main {

	public static void main(String[] args) {
		
		
		Robot robot = new Robot(null, null, null);
		CoffeRobot cofferobot = new CoffeRobot();
		RobotDancer robotdancer = new RobotDancer();
		RobotCoocker robotcoocker = new RobotCoocker(); 
		
		robot.work();
		cofferobot.work();
		robotdancer.work();
		robotcoocker.work();
		
		Robot[] robots =  { robot,  };
		
		
		
		
		System.out.println(robots[0]);

	}

	

}
