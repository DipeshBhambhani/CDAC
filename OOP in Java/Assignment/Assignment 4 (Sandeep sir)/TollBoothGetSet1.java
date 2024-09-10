public class TollBoothGetSet1 {

	public static void main(String[] args) {
		Toll1 w =new Toll1();
		UtilToll u = new UtilToll();
		int choice = 0;
		while((choice = u.choice())!=0) {
			switch(choice) {
			case 1:
				u.setTollRates();
				break;
			case 2:
				u.accept_record();				
				break;
			case 3:
				w.calculateRevenue();
				break;
			case 4:
				u.printRecord();
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
		
				
	}
}