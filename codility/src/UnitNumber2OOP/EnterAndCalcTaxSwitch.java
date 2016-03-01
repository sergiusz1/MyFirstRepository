package UnitNumber2OOP;

public class EnterAndCalcTaxSwitch {

	public static void main(String[] args) {
		
		TaxSwitch tax = new TaxSwitch();
		tax.grossIncome = 12;
		int newSuper = 2;
		int yourTax = tax.calcTax(newSuper);
		
		switch (yourTax){
			case 66 :
				System.out.print("Yor tax is high");
				break;
			case 11:
				System.out.print("Your tax is small");
				break;
			case 22:
				System.out.print("Fuck you");
				break;
			case 33:
				System.out.print("hello");
				break;
			case 44:
				System.out.print("lalalallala");
				break;
			case 99:
				System.out.print("bibib");
				break;
			default :
				System.out.print("incorrect");
		}
	}	
}

class TaxSwitch {

	int grossIncome;
	
	public int calcTax(int newSuperValue){
		if(grossIncome > 12){
			return grossIncome * newSuperValue;
		}else if(grossIncome < 12){
			return grossIncome + newSuperValue;
		}else{
			return grossIncome - newSuperValue;
		}
	}
}	