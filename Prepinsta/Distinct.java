class Distinct{
	public static void main(String args[])
	{
		int counter=0;
		int arr[]={13,14,15,15,16};	
		int n=arr.length;
		int temp[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			//int counter=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=temp[i])		
				{											
					temp[i]=arr[i];							
					counter++;	
				}											
			}												
		}	
		System.out.println(arr.length-counter);
	}
}	