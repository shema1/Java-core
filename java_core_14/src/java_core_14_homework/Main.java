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
			System.out.println("нажми 1 щоб показати танки");
			System.out.println("нажми 2 щоб знайти танк по id");
			System.out.println("нажми 3 щоб видалити танк по id");
			System.out.println("нажми 4 щоб додати танк");
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
