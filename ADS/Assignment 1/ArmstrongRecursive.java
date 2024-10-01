import java.util.Scanner;
public class ArmstrongRecursive{
	static int count, rem, result;
	public static int counter(int n){
		if(n!=0){
			count++;
			counter(n/10);
		}
		return count;
	}
	
	public static int armstrong(int n, int num2){
		if(n!=0){
			rem = n%10;	
			result+= Math.pow(rem,num2);
			armstrong(n/10,num2);						
		}
		return result;		
	}
	
	
	
	public static void main(String[] args){
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count2 = (counter(n));
		int orig = n;
		if(orig == armstrong(n,count2)){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not an Armstrong number");
		}
	}
}
			