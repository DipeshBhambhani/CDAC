
public class BMIGetSet {

	public static void main(String[] args) {
		UtilCalc u = new UtilCalc();
		int choice;
		
		while((choice = u.choice())!=0) {
			switch(choice) {
			case 1: 
				u.acceptRecord();
				break;
			case 2:
				String se = u.toString();
				System.out.println(se);
				u.printRecord();				
				break;
			default:
				System.out.println("Invalid input");
			}		
	}
		u.sc.close();
}
}
