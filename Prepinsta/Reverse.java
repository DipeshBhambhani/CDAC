import java.util.Scanner;
class Reverse{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num = sc.nextInt();
		int arr[] = new int [num+1];
		System.out.println("Enter the elements of array");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		int newarr[] = new int [num+1];
		for(int i=0;i<num;i++)
		{				
				newarr[num-1-i] = arr[i];
		}
		for(int i=0;i<num;i++)
		{
			System.out.println("The " + i + " element of reversed array is: "+newarr[i]);
		}
	}
}