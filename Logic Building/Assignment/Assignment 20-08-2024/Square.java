import java.util.Scanner;
class Square{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a side");
		int a = myObj.nextInt();
		System.out.println("Area of square = " + a*a);
	}
}