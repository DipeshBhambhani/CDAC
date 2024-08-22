import java.util.Scanner;
class PositiveOrNegative{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = myObj.nextInt();
		if (n>0) 
		{
  			System.out.println(n + " is a positive number");
		}
		else
		{
			System.out.println(n + " is a negative number");

		}
	  }
}