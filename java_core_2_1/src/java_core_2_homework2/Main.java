package java_core_2_homework2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human human = new Human("Oleh","colector", 27);
		
		Human human2 = new Human("Mykola", "hunter", 20);
		
		Human[] change = {human2, human};
		for (int i = 0; i < change.length; i++) {
			if(human.type.equals("colector")){
				System.out.println("sadsdf");
				break;
				
			}else{
				System.out.println("wrong");
			}
			
		}
	}

}
