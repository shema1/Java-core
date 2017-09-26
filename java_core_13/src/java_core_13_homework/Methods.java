package java_core_13_homework;

import java.util.Scanner;

public class Methods  {

	Scanner sc = new Scanner(System.in);
	MyException my1 = new MyException();
	
	public void add(){
		System.out.println("введіть два числа щоб додати ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		
		if (a<0 | b<0){
			 throw new IllegalArgumentException("karoch oshibka IllegalArgumentException"); 
		}
		if (a==0 | b!=0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a!=0 | b==0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a!=0 | b==0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a==0 | b==0){
			 throw new IllegalArgumentException("karoch oshibka IllegalArgumentException"); 
		}
		if (a>0 | b>0){
		 
		}
		
	}
	
	public void vid(){
		System.out.println("введіть два числа щоб додати ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a - b;
		
		if (a<0 | b<0){
			 throw new IllegalArgumentException("karoch oshibka IllegalArgumentException"); 
		}
		if (a==0 | b!=0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a!=0 | b==0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a!=0 | b==0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a==0 | b==0){
			 throw new IllegalArgumentException("karoch oshibka IllegalArgumentException"); 
		}
		if (a>0 | b>0){
		 
		}
		
	}
	
	
	public void mno(){
		System.out.println("введіть два числа щоб додати ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		
		if (a<0 | b<0){
			 throw new IllegalArgumentException("karoch oshibka IllegalArgumentException"); 
		}
		if (a==0 | b!=0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a!=0 | b==0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a!=0 | b==0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a==0 | b==0){
			 throw new IllegalArgumentException("karoch oshibka IllegalArgumentException"); 
		}
		if (a>0 | b>0){
		 
		}
		
	}
	

	public void dil(){
		System.out.println("введіть два числа щоб додати ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a / b;
		
		if (a<0 | b<0){
			 throw new IllegalArgumentException("karoch oshibka IllegalArgumentException"); 
		}
		if (a==0 | b!=0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a!=0 | b==0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a!=0 | b==0){
			 throw new ArithmeticException("karoch oshibka Arithmetic expression"); 
		}
		if (a==0 | b==0){
			 throw new IllegalArgumentException("karoch oshibka IllegalArgumentException"); 
		}
		if (a>0 | b>0){
		 
		}
		
	}
	
	
//	public void add2(){
//		System.out.println("введіть два числа щоб додати ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = a + b;
//		try{
//		if (a<0 | b<0){
//			throw new IllegalArgumentException("karoch oshibka"); 
//		}
//		}catch (IllegalArgumentException e){
//			System.out.println( "oshibka blya");
//		}
//		
//	}
	
	
	public void subtract(){
		System.out.println("введіть два числа щоб відняти ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
	}
}
