import java.util.Scanner;
class AscDes{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num = sc.nextInt();
		int arr[] = new int [num+1];
		System.out.println("Enter the elements");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		int halfnum = 0;
		int revhalfnum = 0;
		int temp=arr[0];
		int revtemp = arr[num-1];
		if(num%2==0)
		{
			halfnum = num/2;
			for(int i=0;i<halfnum;i++)
			{
				if(temp>arr[i])
				{
					int temp1 = 0;
					temp1 = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp1;
				}
				else
				{
					temp = arr[i];
					//arr[i] = temp;
				}
			}
			for(int i=num-1;i>=halfnum;i--)
			{
				if(revtemp>arr[i])
				{
					int revtemp1 = 0;
					revtemp1 = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = revtemp1;
				}
				else
				{
					revtemp=arr[i];
					//arr[i]=revtemp;
				}
			}
			for(int i=0;i<num;i++)
			{
				System.out.println("Sort first half in ascending order and second half in descending order: "+ arr[i]);
			}
		}
		else
		{
			halfnum = (num/2)+1;
			for(int i=0;i<halfnum;i++)
			{
				if(temp>arr[i])
				{
					arr[i-1] = arr[i];
					temp = arr[i];
					//arr[i] = temp;
				}
				else
				{
					temp = arr[i];
					//arr[i] = temp;
				}
			}
			revhalfnum = num/2;
			for(int i=num;i>revhalfnum;i--)
			{
				if(revtemp<arr[i])
				{
					arr[i-1] = arr[i];
					revtemp = arr[i];
					//arr[i]=revtemp;
				}
				else
				{
					//arr[i]=revtemp;
					revtemp=arr[i];
				}
			}
			for(int i=0;i<num;i++)
			{
				System.out.println("Sort first half in ascending order and second half in descending order: "+ arr[i]);
			}
		}
	}
}