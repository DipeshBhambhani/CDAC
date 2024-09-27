import java.util.Scanner;
class SumOfElements{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num = sc.nextInt();
		int arr[] = new int [num+1];
		int sum = 0;
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			sum += arr[i];
		}
		System.out.println("Sum of the elements is = " + sum);
	}
}	