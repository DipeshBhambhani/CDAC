public class CompoundInterestCalculatorGetSet1{
	public static void main(String[] args) {
		CalUtili c = new CalUtili();
		int choice;
		while((choice=c.choice())!=0)
			switch(choice) {
			case 1:
					c.acceptRecord();
			break;
			case 2:
					String str = c.toString();
					System.out.println(str);
					c.printRecord();
			break;
			default:
					System.out.println("Invalid input\n");
					break;
			}
		c.sc.close();
	}
}	