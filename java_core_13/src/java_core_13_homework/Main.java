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
	System.out.println("������ 1 ��� ���������");
	System.out.println("������ 2 ��� ��������");
	System.out.println("������ 3 ��� ��������");
	System.out.println("������ 4 ��� ������");
	System.out.println("������ 5 ��� ������");
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
