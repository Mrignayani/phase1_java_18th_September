package eg1;

public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asHJGUJH!~&@ jjgvgDthE ,, 90.-";
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println(s.replaceAll("[a-zA-Z0-9]", ""));

	}

}
