package thejavakids;

public class speed {
	
	int  meter;
	int sek;
	int min;

	public static void main(String[] args) {
	
		int meter = 17;
		int sek = 18;
		int min = 3;
		int sekmin = 198;
		
		System.out.println("Hastighet ( i meter/sekund):"+ meter);
		System.out.println("Tid (i sekunder): " + sek); 
		System.out.println("Tid (i minuter): " + min); 


		System.out.println("Du har färdats i " + sekmin * meter + " meter!");
		
		
	}

		

}
