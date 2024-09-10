import java.util.Scanner;

	public class UtilToll{
		Scanner sc =new Scanner (System.in);
		int a;
		Toll1 TRF =new Toll1();
		public void setTollRates()
		{
				System.out.println("Do you Want to Enter The New Toll Prices ? \n1.Yes\n2.No");
				int a=(sc.nextInt());
				if(a==1)
				{
				System.out.println("Enter Toll Rate For Car:");
				TRF.setCar_rate(sc.nextInt());
				System.out.println("Enter Toll Rate For Truck:");
				TRF.setTruck_rate(sc.nextInt());
				System.out.println("Enter Toll Rate For Motorcycle:");
				TRF.setMotorcycle_rate(sc.nextInt());
				}
	}
		public void accept_record()
		{
			do {		
			System.out.println("Select Your Vehicle Type:\n1.Car\n2.Truck\n3.Motorcycle");
			TRF.addVehicle(sc.nextInt());
			System.out.println("Do you Want to add vehicle ? \n1.Yes\n2.No");
			a =sc.nextInt();
			} while (a!=2);
		}
		public void printRecord()
		{
			TRF.calculateRevenue();
			System.out.println("Car        : "+TRF.getC_count()+" x "+TRF.getCar_rate()+"  = "+TRF.getC_sum());
			System.out.println("Truck 	   : "+TRF.getT_count()+" x "+TRF.getTruck_rate()+" = "+TRF.getT_sum());
			System.out.println("MotorCycle : "+TRF.getM_count()+" x "+TRF.getMotorcycle_rate()+"  = "+TRF.getM_sum());
			System.out.println("------------------------------");
			System.out.println("Total Revenu: "+TRF.getTotal());
			System.out.println("Total vehicles: "+(int)(TRF.getM_count()+TRF.getC_count()+TRF.getT_count()));
			String str = TRF.toString();
			System.out.println(str);
		}
		public int choice() {
			System.out.println("\nEnter 1 to set records");
			System.out.println("Enter 2 to accept records");
			System.out.println("Enter 3 to calculate records");
			System.out.println("Enter 4 to print records");
			System.out.println("Enter 0 to exit");
			int choice = sc.nextInt();
			return choice;
		}

	}
