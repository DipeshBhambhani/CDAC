class Prime{
	public static void main(String args[])
	{
		int count = 0,chk; 
		for(int i=2;count<5;i++)
		{
			chk=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					chk++;
					break;
				}
			}
			if(chk==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
	}
}
		