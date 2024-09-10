
public class BMITracker2{
		private float weight;
		private float height;
		private float bmi;
		private String classification;
		
		public BMITracker2() {
			
		}
		public BMITracker2(float weight, float height) {
			this.weight=weight;
			this.height=height;
		}
		public float getWeight() {
			return weight;
		}
		public void setWeight(float weight) {
			this.weight = weight;
		}
		public float getHeight() {
			return height;
		}
		
		public void setHeight(float height) {
			this.height = height;
		}
		public float getBmi() {
			return bmi;
		}
		public void setBmi(float bmi) {
			this.bmi = bmi;
		}
		public String getClassification() {
			return classification;
		}
		public void setClassification(String classification) {
			this.classification = classification;
		}
		public void calculateBMI() {
			bmi=weight/(height*height);
		}
				
		public void classifyBMI() {
			
			if(bmi<18.5) {
				classification = "Underweight\n";
			}
			else if(bmi>=18.5 && bmi<24.9){
				classification = "Normal weight\n";
			}
			else if(bmi>=25 && bmi<29.9){
				classification = "Overweight\n";
			}
			else{
				classification = "Obese\n";
			}
		}
	}
