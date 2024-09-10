public class LoanAmortizationCalculatorGetSet1{
	public static void main(String[] args) {
		CalUtill cu = new CalUtill();
		int choice;
		while((choice = cu.choice())!=0) {
			switch(choice) {
			case 1: cu.acceptRecord();
			break;
			case 2: String str = cu.toString();
					System.out.println(str);
					cu.printRecord();
			break;
			default:System.out.println("Invalid input");
				break;
			}
		}
		CalUtill.sc.close();
	}
	
}
