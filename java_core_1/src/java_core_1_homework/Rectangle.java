package java_core_1_homework;

public class Rectangle {
	
	int width;
	int length;
	
	public Rectangle() {
		
	}
	
	 public Rectangle (int width, int length){
		 this.width = width;
		 this.length = length;
	 }
	 
	 public int square(){
		 int square = width*length;
		 System.out.println("Площа прямокутника = "+ square);
		 return square;
	 }
	 
	 public void square2(){
		 int square = width*length;
		 System.out.println("Площа прямокутника = "+ square);
	 }
	 
	 public int perimeter(){
		 int perimeter = (width+length)*2;
		 System.out.println("Периметр прямокутника = "+ perimeter);
		 return perimeter;
	 }
	 
	 public int perimeter2(){
		 int perimeter = (width+length)*2;
		 System.out.println("Периметр прямокутника = "+ perimeter);
		 return perimeter;
	 }
	 
	 public void qwer(){
		 System.out.println( "asdfsdS");
	 }
	 

}
