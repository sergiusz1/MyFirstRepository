package UnitNumber2OOP;

import java.util.Scanner;

public class TestTax {
	public static void main(String[] args) {
		
		System.out.println("Enter your sallary : ");
		Scanner sallaryscan = new Scanner (System.in);
		Double sallaryValue = sallaryscan.nextDouble();
				
		System.out.print("Are you from New Jersea ? Input - '1' if Yes or '2' if No : ");
		Scanner jerseascan = new Scanner (System.in);
		Double jersealiving = jerseascan.nextDouble();	
		
		if(jersealiving == 1) {
			System.out.print("Is there student in your family ? Input - '1' if Yes or '2' if No : ");
			Scanner studentscan = new Scanner (System.in);
			Double studentAvalibility = studentscan.nextDouble();
			
			if (studentAvalibility == 1) {
				NJTax njtax = new NJTax(sallaryValue);
				double yourTax = njtax.onlyForStudents();
				System.out.print("Your tax is " + yourTax + " dollars");
			} else {
				Tax tax = new Tax(sallaryValue);
				double yourTax = tax.calcTax();
				System.out.print("Your tax is " + yourTax + " dollars");
			}
			
		} else {
			Tax tax = new Tax(sallaryValue);
			double yourTax = tax.calcTax();
			System.out.print("Your tax is " + yourTax + " dollars");
		}
	}
}
