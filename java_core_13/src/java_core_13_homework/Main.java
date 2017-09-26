package java_core_13_homework;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


Methods m = new Methods();

MyException my = new MyException();
Scanner sc = new Scanner(System.in);

   int user =0;     
do{
	System.out.println("введіть 1 для додавання");
	System.out.println("введіть 2 для віднімання");
	System.out.println("введіть 3 для множення");
	System.out.println("введіть 4 для ділення");
	System.out.println("введіть 5 для виходу");
	 user = sc.nextInt();
	switch (user) {
	case 1:
		m.add();
		break;
		
case 2:
		m.vid();
		break;
case 3:
	m.mno();
	break;
case 4:
	m.dil();
	break;
	

	default:
		break;
	}
}while(user!=5);
System.out.println("exit");
	


	
	}

}
