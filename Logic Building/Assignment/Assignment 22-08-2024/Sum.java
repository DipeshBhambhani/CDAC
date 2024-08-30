class Sum{
	public static void main(String args[])
	{
		int num = 9876, temp = num, sum = 0; 
		String output = "", revoutput = "";
		while(num!=0)
		{
			int remainder = num%10;		
			sum = sum + remainder;
			num = num/10;
			if(num != 0)
			{
				output += remainder + " + ";
			}
			else
			{
				output += remainder;
			}			
		}
		for(int i = 0; i<output.length();i++)
		{
			revoutput = output.charAt(i) + revoutput;
		}
		System.out.println("Sum = " + sum + "(" + revoutput + ")");
	}
}	