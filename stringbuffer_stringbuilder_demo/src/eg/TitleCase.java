package eg;

public class TitleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "hello hi good evening everyone";
StringBuilder sb = new StringBuilder();
String s1[] = s.split(" ");
for (String x :s1) {
	sb.append(x.toUpperCase().charAt(0)).append(x.substring(1)).append(" ");
	
}
	System.out.println(sb);	
	}

}
