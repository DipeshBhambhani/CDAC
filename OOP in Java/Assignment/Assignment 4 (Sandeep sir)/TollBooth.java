import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
class Toll
{
	private int ch;
	private int car_rate;
	private int truck_rate;
	private int motorcycle_rate;
	private int a=1;
	private int c_count=0;
	private int t_count=0;
	private int m_count=0;
	private int c_sum=0;
	private int t_sum=0;
	private int m_sum=0;
	private int total=0;	
	private String vname;
	Scanner sc =new Scanner (System.in);	
	public Toll()
	{
		System.out.println("Default rates if you do not enter rates");
		 this.car_rate=50;
		 this.truck_rate=100;
		 this.motorcycle_rate=30;
		 System.out.println("Car        :"+this.car_rate);
		 System.out.println("Truck      :"+this.truck_rate);
		 System.out.println("Motorcycle :"+this.motorcycle_rate);
	}
public void setTollRates()
{

		System.out.println("Do you Want to Enter The New Toll Prices ? \n1.Yes\n2.No");
		a =sc.nextInt();
		if(a==1)
		{
		System.out.println("Enter Toll Rate For Car:");
		this.car_rate=sc.nextInt();
		System.out.println("Enter Toll Rate For Truck:");
		this.truck_rate=sc.nextInt();
		System.out.println("Enter Toll Rate For Motorcycle:");
		this.motorcycle_rate=sc.nextInt();
		}		
}
	public void accept_record()
	{
		do {		
		System.out.println("Select Your Vehicle Type:\n1.Car\n2.Truck\n3.Motorcycle");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
		{
			c_sum=c_sum+car_rate;		
			c_count++;
		}			
			break;
		case 2:
			{
				t_sum=t_sum+truck_rate;
				
				t_count++;
			}				
				break;		
		case 3:
	    	{
		     	m_sum=m_sum+motorcycle_rate;
		     
			  	m_count++;
			}					
					break;
		default:
			System.out.println("Invalid input");
			break;
		}
		System.out.println("Do you Want to add vehicle ? \n1.Yes\n2.No");
		a =sc.nextInt();
		} while (a!=2);
	}
	public void calculateRevenue()
	{
		total=m_sum+t_sum+c_sum;
	}
	public void printRecord()
	{
		//NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en","in"));
		System.out.println("Car        : "+c_count+" x "+car_rate+"  = "+c_sum);
		System.out.println("Truck 	   : "+t_count+" x "+truck_rate+" = "+t_sum);
		System.out.println("MotorCycle : "+m_count+" x "+motorcycle_rate+"  = "+m_sum);
		System.out.println("------------------------------");
		System.out.println("Total Revenu: "+total);
		System.out.println("Total count: "+ (int)(c_count+t_count+m_count));
	}
}
public class TollBooth {

	public static void main(String[] args) {
		Toll w =new Toll();
		w.setTollRates();
		w.accept_record();
		w.calculateRevenue();
		w.printRecord();		
	}
}