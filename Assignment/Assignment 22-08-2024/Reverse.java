class Reverse{
	public static void main(String args[])
	{
		int num = 1234, reverse = 0, temp=num;
		while(num!=0)
		{
			int remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num/10;
		}
	System.out.println("Reverse of "+temp+" is: "+reverse);
	}
}