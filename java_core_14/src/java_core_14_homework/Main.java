package java_core_14_homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		
		
		BD bd = new BD();
		Scanner sc = new Scanner(System.in);
	
		
		int menu;
		int exit = 5;
		
		do{
			System.out.println("����� 1 ��� �������� �����");
			System.out.println("����� 2 ��� ������ ���� �� id");
			System.out.println("����� 3 ��� �������� ���� �� id");
			System.out.println("����� 4 ��� ������ ����");
			menu = sc.nextInt();
			switch (menu) {
			case 1 :
				bd.show();
			    break;
			case 2 :
				bd.findById();
			    break;
			    
			case 3 :
				bd.delById();
			    break;
			    
			case 4:
				bd.ptt();
				break;

			default:
				break;
			}
			
		}while(menu!=exit);
		System.out.println("exit");
			
		
		
	}

}
