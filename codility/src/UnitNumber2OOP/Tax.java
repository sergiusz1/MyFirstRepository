package UnitNumber2OOP;

public class Tax {
	
	double gross;
	
	
	Tax (double gr){
		gross = gr;
	}
	
	public double calcTax() {
		
		if (gross > 5000.0) {
			return gross*0.06;
		} else if (gross < 5000.0) {
			return gross*0.02;
		} else {
			return gross*0.04;
		}
	}
}
