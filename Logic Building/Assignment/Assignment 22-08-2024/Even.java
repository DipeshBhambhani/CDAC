class Even{
	public static void main(String args[])
	{
		String res = "";
		for(int i=1;i<=50;i++)
		{
			if(i!=50)
			{
				res += i%2==0?i+", ":"";
			}
			else
			{
				res += i%2==0?i:"";	
			}
		}
		System.out.print(res);
	}
}