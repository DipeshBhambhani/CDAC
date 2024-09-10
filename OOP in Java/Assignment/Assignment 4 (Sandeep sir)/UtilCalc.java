import java.util.Scanner;
public class UtilCalc {
	BMITracker2 bt = new BMITracker2();
	static Scanner sc = new Scanner(System.in);
	public void acceptRecord(){
		System.out.print("Enter your height in meters: ");
		bt.setHeight(sc.nextFloat());
		System.out.print("Enter your weight in kgs: ");
		bt.setWeight(sc.nextFloat());		
	}	
	public void printRecord() {
		bt.calculateBMI();
		bt.classifyBMI();
		System.out.println("Your BMI is: "+bt.getBmi()+" kg/m^2");
		System.out.println("You are: "+bt.getClassification());
	}
	@Override
	public String toString() {
		return "BMITracker2 [weight=" + this.bt.getWeight() +" kg, height=" + this.bt.getHeight() + " m ]";
	}
	public int choice() {
		System.out.println("Enter 1 to accept records");
		System.out.println("Enter 2 to print records");
		System.out.println("Enter 0 to exit");
		int choice=sc.nextInt();
		return choice;
	}
}