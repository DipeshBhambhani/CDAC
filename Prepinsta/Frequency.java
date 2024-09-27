class Frequecny
{
	public static void main(String args[])
	{
		int arr[]={10,5,3,10,3,6,9,8,5};
		int n=arr.length;		
		int temp[]=new int[n];
		int temp1[]=new int[n];
		int counter=1;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				//System.out.println(temp[i]);
				if(arr[i]==arr[j] && arr[i]!=temp[i])
				{
					temp[i]=arr[i];
					count++;
				}			
			}
			System.out.println(count + " " + arr[i]);					
		}
	}
}