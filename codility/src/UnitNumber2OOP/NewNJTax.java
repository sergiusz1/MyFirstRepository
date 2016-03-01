package UnitNumber2OOP;

public class NewNJTax extends NewTax {

		double adjustForStudents(double stateTax){
			stateTax = grossIncome - 500;
			return stateTax;
		}
}
