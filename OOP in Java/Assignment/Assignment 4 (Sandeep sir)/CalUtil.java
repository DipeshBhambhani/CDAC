import java.util.Scanner;

class CalUtili{
	Scanner sc = new Scanner(System.in);
	CompoundInterestCalculator2 c = new CompoundInterestCalculator2();
	public void acceptRecord() {		
		System.out.print("Enter principal amount: ");
		c.setPrincipal(sc.nextFloat());
		System.out.print("Enter rate: ");
		c.setRate(sc.nextFloat());
		System.out.print("Enter compounding time: ");
		c.setCompoundingTime(sc.nextInt());
		System.out.print("Enter duration: ");
		c.setDuration(sc.nextFloat());
	}
	public void printRecord() {
		c.calculateFutureValue();
		System.out.printf("The future payment value = "+"%.2f%n",c.getFutureValue()); 
		System.out.printf("Total interest paid = " + "%.2f%n%n",c.getTotalInterest());
	}
	@Override
	public String toString() {
		return "CompoundInterestCalculator2 [principal=" + this.c.getPrincipal() + ", rate=" + this.c.getRate() + ", compoundingTime="
				+ this.c.getCompoundingTime() + ", duration=" + this.c.getDuration() + "]";
	}
	public int choice() {
		System.out.println("Enter 1 to accept records");
		System.out.println("Enter 2 to print records");
		System.out.println("Enter 0 to exit");
		int choice = sc.nextInt();
		return choice;
	}
}
