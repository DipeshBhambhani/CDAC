import java.util.Scanner;
class OddEven{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = myObj.nextInt();
		if (n%2==0) 
		{
  			System.out.println(n + " is an even number");
		}
		else
		{
			System.out.println(n + " is an odd number");

		}
	  }
}