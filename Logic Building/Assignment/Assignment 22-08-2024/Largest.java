class Largest{
	public static void main(String args[])
	{
		int num = 4825, largest = 0, digit = 0;
		while(num!=0)
		{
			digit = num%10;
			if(digit>largest)
			{
				largest = digit;
			}
			num/=10;
		}
		System.out.println("The largest digit is: " + largest);
	}
}
			
			