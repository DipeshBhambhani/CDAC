import java.util.Scanner;
class LargestOfThreeNumbers{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = myObj.nextInt();
		System.out.println("Enter a number");
		int n2 = myObj.nextInt();
		System.out.println("Enter a number");
		int n3 = myObj.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1 + " is the largest number");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2 + " is the largest number");
		}
		else
		{
			System.out.println(n3 + " is the largest number");

		}
	}
}