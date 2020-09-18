package eg1;

public class OldStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asHJGUJH!~&@ jjgvgDthE ,, 90.-";
		int alpha = 0, upper = 0, lower = 0,digit =0, alphaNum = 0,
				spaces = 0, special = 0;
		
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(0);
			if (Character.isAlphabetic(c)) {
				alpha++;
			}
			if (Character.isUpperCase(c)) {
				upper++;
			}
			if (Character.isLowerCase(c)) {
				lower++;
			}
			if (Character.isDigit(c)) {
				digit++;
			}
			if (Character.isLetterOrDigit(c)) {
				alphaNum++;
			}
			if (Character.isWhitespace(c)) {
				spaces++;
			}
			if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}

		}
		System.out.println("Alphbet count = " + alpha);
		System.out.println("Upper Alphbet count = " + upper);
		System.out.println("Lower Alphbet count = " + lower);
		System.out.println("Digits count = " + digit);
		System.out.println("Alphanumeric count = " + alphaNum);
		System.out.println("Spaces count = " + spaces);
		System.out.println("Special count = " + special);

	}

}
