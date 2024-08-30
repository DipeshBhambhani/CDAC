import java.util.Scanner;
class GoodMorning{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter current time in 24 hours format");
		int t = myObj.nextInt();
		if (t>=5 && t<=12) 
		{
  			System.out.println("Good Morning");
		}
	}
}