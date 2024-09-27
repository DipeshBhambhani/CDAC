import java.util.Scanner;
class LargestAndSmallestElement{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num = sc.nextInt();
		int arr[] = new int[num+1];
		System.out.println("Enter the elements of array");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		int temp = arr[0];
		for(int i=0;i<num;i++)
		{
		if(temp<arr[i])
			{
				temp = arr[i];
			}
		}	
		System.out.println("The largest number in the array is = " + temp);
		for(int i=0;i<num;i++)
		{
		if(temp>arr[i])
			{
				temp = arr[i];
			}
		}	
		System.out.println("The smallest number in the array is = " + temp);
	}
}
			