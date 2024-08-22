import java.util.Scanner;
class Rectangle{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter length");
		int l = myObj.nextInt();
		System.out.println("Enter breadth");
		int b = myObj.nextInt();
		System.out.println("Area of rectangle = " + l*b);
	  }
}