import java.util.Scanner;
class SecondSmallest{
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
		int temp = arr[0];
		for(int i=0;i<num;i++)
		{
			if(temp>arr[i])
			{
				temp=arr[i];
			}
		}
		int newarr[] = new int [num+1];
		for(int i=0;i<num;i++)
		{
			if(arr[i]>temp)
			{
				newarr[i] = arr[i];
			}
			else
			{
				newarr[i] = Integer.MAX_VALUE;
			}
		}
		int newtemp = newarr[0];
		for(int i=0;i<num;i++)
		{
			if(newtemp>newarr[i])
			{
				newtemp=newarr[i];
			}
		}
		System.out.println("The second smallest element in the array is = " + newtemp);
	}
}				