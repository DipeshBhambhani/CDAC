import java.util.Scanner;
class RepeatingElements{
	public static void main(String args[])
	{
		int counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num = sc.nextInt();
		int arr[] = new int[num+1];
		int temp[] = new int[num+1];
		System.out.println("Enter the elements");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=temp[i])
				{
					temp[i]=arr[i];
					System.out.println (arr[i]);
					break;
				}
			}
		}
	}
}