import java.util.Scanner;

public class CalUtill{
			LoanAmortizationCalculatorGetSet l = new LoanAmortizationCalculatorGetSet();
			static Scanner sc = new Scanner(System.in);
			public void acceptRecord() {
				System.out.println("Enter the loan amount");
				l.setPrincipal(sc.nextFloat());
				System.out.println("Enter interest rate");
				l.setRate(sc.nextFloat());
				System.out.println("Enter the loan term");
				l.setTerm(sc.nextInt());
			}
			public void printRecord() {
				//l.toString();
				l.calculateMonthlyPayment();				
			}
			@Override
			public String toString() {
				return "Principal= "+this.l.getPrincipal()+" "+"Rate= "+this.l.getRate()+" "+"Term= "+this.l.getTerm();
			}
			public int choice(){
				System.out.println("Enter 1 to set values");
				System.out.println("Enter 2 to print values");
				System.out.println("Enter 0 to exit");
				int choice = sc.nextInt();
				return choice;
			}
		}
