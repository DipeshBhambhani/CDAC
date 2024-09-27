class Sort{
	public static void main(String args[])
	{
		int temp=0;
		int arr[]={120,240,30,10,50,80,45,10};		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		System.out.println(arr[i]);
		}	
	}
}
		
				