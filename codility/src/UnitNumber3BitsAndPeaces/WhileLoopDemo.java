package UnitNumber3BitsAndPeaces;

public class WhileLoopDemo {
	public static void main(String[] args) {
		String [] friends = new String[10];
		friends [0] = "Masha";
		friends [1] = "Marusia";
		friends [3] = "Dusia";
		friends [4] = "Pizdusia";
		friends [5] = "Hujusia";
		friends [6] = "Rosa";
		friends [7] = "Hilary";
		friends [9] = "Samanta";
		int allElements = friends.length;
		int i = 0;
		
		final int sdsd_dsdsd = 3;
		
		while (i<friends.length){
			if(friends[i] == null){
				i++;
				// Go back to the while check
				continue;
			}
			System.out.println("I love " + friends[i]);
			i++;
		}
		System.out.print("The iteration is over");
	}
}
