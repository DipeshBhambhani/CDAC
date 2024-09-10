import java.util.Scanner;

public class DiscountUtil {
	Scanner sc = new Scanner(System.in);
	DiscountCalculator1 d = new DiscountCalculator1();
	public void acceptRecord(){		
		System.out.print("Enter the original price: ");
		d.setOriginalPrice(sc.nextFloat());
		System.out.print("Enter the discount percentage: ");
		d.setDiscountRate(sc.nextFloat());
	}	
	public void printRecord() {
		String str = d.toString();
		System.out.println(str);
		d.calculateDiscount();		
	}
	public int choice() {
		System.out.println("Enter 1 to accept reords");
		System.out.println("Enter 2 to print reords");
		System.out.println("Enter 0 to exit");
		int choice = sc.nextInt();
		return choice;
	}
}
