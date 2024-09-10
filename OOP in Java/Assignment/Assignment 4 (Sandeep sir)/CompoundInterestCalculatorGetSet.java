import java.util.Scanner;
import java.lang.Math;
class CompoundInterestCalculator2 {
	private float principal;
	private float rate;
	private int compoundingTime;
	private float duration;
	private double futureValue;
	private double totalInterest;
	
	public CompoundInterestCalculator2(){
		
	}
	public CompoundInterestCalculator2(float principal, float rate, int compundingTime, float duration){
		this.principal = principal;
		this.rate = rate;
		this.compoundingTime = compoundingTime;
		this.duration = duration;
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
	public float getCompoundingTime() {
		return compoundingTime;
	}
	public void setCompoundingTime(int compoundingTime) {
		this.compoundingTime = compoundingTime;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public double getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(double futureValue) {
		this.futureValue = futureValue;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}
		
	public void calculateFutureValue() {
		futureValue = principal*Math.pow((1+(rate/100)/compoundingTime),
				(compoundingTime*duration));
		totalInterest = futureValue - principal;
	}
		
}



