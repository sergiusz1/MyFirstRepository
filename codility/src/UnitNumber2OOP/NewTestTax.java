package UnitNumber2OOP;

public class NewTestTax {

	public static void main(String[] args) {
		
		NewNJTax t = new NewNJTax();
		
		t.grossIncome = 4000;
		t.state = "Los Angeles";
		t.dependens = 3;
		
		double yourTax = t.calcTax();
		
		System.out.println("Your tax is " + t.adjustForStudents(yourTax));
	}

}
