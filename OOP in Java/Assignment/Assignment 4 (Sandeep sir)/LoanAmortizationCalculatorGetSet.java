import java.util.Scanner;
import java.lang.Math;
class LoanAmortizationCalculatorGetSet {
	
	
	private float principal;
	private float rate;
	private int term;
	double monthlyPayment;
	double totalAmountPaid;
	int count=0;
	public LoanAmortizationCalculatorGetSet() {
		
	}
	public LoanAmortizationCalculatorGetSet(float principal, float rate, int term) {
		this.principal = principal;
		this.rate = rate;
		this.term = term;
	}
	public float getPrincipal() {
		return principal;
	}
	public void setPrincipal(float principal) {
		this.principal = principal;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	/*public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}*/
	public double getTotalAmountPaid() {
		return totalAmountPaid;
	}
	/*public void setTotalAmountPaid(double totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}*/
	
	public void calculateMonthlyPayment() { 
	monthlyPayment = principal * 
			 ((rate/1200) * 
			 Math.pow((1 + (rate/1200)),((float)term)*12)) 
			 / (Math.pow((1 + (rate/1200)),((float)term)*12) - 1);
	 totalAmountPaid = monthlyPayment * term * 12;
	 System.out.println("Monthly payment = "+ monthlyPayment);
	 System.out.println("Total amount paid = "+ totalAmountPaid + "\n");
}
		
}