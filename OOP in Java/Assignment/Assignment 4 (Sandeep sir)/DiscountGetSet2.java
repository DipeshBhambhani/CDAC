public class DiscountGetSet2 {

	public static void main(String[] args) {
		DiscountUtil d = new DiscountUtil();
		int choice;
		while((choice=d.choice())!=0) {
			switch(choice) {
			case 1:
				d.acceptRecord();
				break;
			case 2:
				d.printRecord();
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
		d.sc.close();
	}
}