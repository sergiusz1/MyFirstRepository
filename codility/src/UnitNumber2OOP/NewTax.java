package UnitNumber2OOP;

public class NewTax {
	
	double grossIncome;
	String state;
	int dependens;
	
	public double calcTax(){
		if (grossIncome > 5000.0) {
			return grossIncome*0.06;
		} else if (grossIncome < 5000.0) {
			return grossIncome*0.02;		
		} else {
			return grossIncome*0.04;
		}
	}
}
