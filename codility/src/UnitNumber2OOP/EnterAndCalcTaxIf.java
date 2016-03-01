package UnitNumber2OOP;

public class EnterAndCalcTaxIf {
	
	public static void main(String[] args) {
		
		TaxIf tax = new TaxIf();
		
		tax.grossIncome = 4033.00;
		tax.state = "Alabama";
		tax.dependents = 2;
		
		double yourTax = tax.calcTax();
		
		System.out.println(yourTax);
	}

}

class TaxIf {
	
	double grossIncome;
	String state;
	int dependents;
	
	public double calcTax(){
		
		if(state == "New York" && dependents == 2 && grossIncome >= 5000.0){
			return grossIncome*0.03;
		}else if(state == "Alabama" && dependents == 2 && grossIncome <= 5000.0){
			return grossIncome*0.02;
		}else{
			return grossIncome*0.4;
		}
	}
}

