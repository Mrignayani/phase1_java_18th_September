package eg1;

public class PanCard {

	public static void main(String[] args) {
		//total len is 10
		// where 1st 5 will be uppercase letters
		// followed by 4 digits
		// and a uppercase letter in end
		
		String pan = "ABEEM9341A";
		
		if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("VAlid Pan");
		}else {
			System.out.println("InVAlid Pan");
		}
String pan1 = "ABE EM9341A";
		
		if (pan1.matches("[A-Z]{3} [A-Z]{2}[0-9]{4}[A-Z]{1}")) {
			System.out.println("VAlid Pan");
		}else {
			System.out.println("InVAlid Pan");
		}

	}

}
