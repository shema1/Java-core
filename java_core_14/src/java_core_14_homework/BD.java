package java_core_14_homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class BD {
	
	
	ArrayList<Tank> tanks = new ArrayList<>();
	
	File file = new File("text.txt");
	
	Tank tank = new Tank(2, 12, "qwe", "l", "USSR");
	
	
	
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	


	public void delById() throws IOException{
		
		
		boolean ch2 = true;
		System.out.println("¬каж≥ть id");
		String findId = bufferedReader.readLine();
		int q = Integer.parseInt(findId);
		
		
		for (Tank tank : tanks) {
			if (tank.getId() == q) {
				tanks.remove(tank);	
			ch2 = false;
			}
		}
		if(ch2 = false){
		System.out.println("nema kurwa");
		}
		
		
	}


//______________________________________________________________________

	public void findById() throws IOException{
		boolean ch = true;
		System.out.println("¬каж≥ть id");
		String findId = bufferedReader.readLine();
		int q = Integer.parseInt(findId);
		
		
		for (Tank tank : tanks) {
			if (tank.getId() == q) {
			System.out.println(tank);
			ch = false;
			}
		}
		if(ch = false){
		System.out.println("nema kurwa");
		}
	}




//	_____________________________________________________________________



	public void show(){
	for (Tank tank : tanks) {
		System.out.println(tank);
	}
}

//________________________________________________________________________
	
	public void ptt() throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream(file, true);
//		int id = 0 + (int) (Math.random() * 50);
		boolean cheker = true;
		
		System.out.println("input id");
		String id = bufferedReader.readLine();
		int id2 = Integer.parseInt(id);
		boolean chekid = true;
		
			
		if (tanks.isEmpty()){
			System.out.println( "ok");
		}else{
			for (Tank tank : tanks) {
				if (tank.getId()== id2){
				cheker = false;
				}
		}
		}
		
		if(cheker== true){
		
		
		
		System.out.println("input name");
		String name = bufferedReader.readLine();
		
		System.out.println("input age");
		String age = bufferedReader.readLine();
		int a2 = Integer.parseInt(age);
		
		System.out.println("input type");
		String type = bufferedReader.readLine();
		
		System.out.println("input country");
		String country = bufferedReader.readLine();
		
		
		Tank tank1 = new Tank(id2, a2, name, type, country);
		tanks.add(tank1);
		
		System.out.println(id +" "+ name+ " "+ age + " "+ a2 + "" + country);
		
		fileOutputStream.write( "\n".getBytes());
		fileOutputStream.write(tank1.toString().getBytes());
		
		}else{
			System.out.println("error такий id вже Ї");
		}
	
	
//public void add() throws IOException{
//	
//	int a =  tank.getAge();
//	String b = Integer.toString(a) ;
//	
//	FileOutputStream fileOutputStream = new FileOutputStream(file,true);
//	fileOutputStream.write( tank.getName().getBytes());
//	fileOutputStream.write( tank.getCountry().getBytes());
//	fileOutputStream.wait();
//	fileOutputStream.write( "\n".getBytes());
//
//	
//		
//	}
	

}
}
