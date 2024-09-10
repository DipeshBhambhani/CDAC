import java.util.Scanner;
public class DiscountCalculator1{
	private float originalPrice;
	private float discountRate;
	private float discountAmount;
	private float finalPrice;
	
	
	public float getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	public float getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
	public float getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(float discountAmount) {
		this.discountAmount = discountAmount;
	}
	public float getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(float finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	@Override
	public String toString() {
		return "DiscountCalculator1 [originalPrice=" + originalPrice + ", discountRate=" + discountRate
				+"]";
	}
	public void calculateDiscount() {
		this.discountAmount = originalPrice * (discountRate / 100);
		this.finalPrice = originalPrice - discountAmount;
	}
}


