package UnitNumber2OOP;

public class NJTax extends Tax{
	
	NJTax(double gro) {
		super(gro);
	}

	public double onlyForStudents(){
		return calcTax()*0.1;
	} 
}
