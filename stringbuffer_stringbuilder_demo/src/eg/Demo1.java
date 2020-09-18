package eg;

public class Demo1 {

	public static void main(String arg[]) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		sb.append(" hey").append("Java");
		System.out.println(sb);
		
		sb.insert(1, "HIBERNATE");
		System.out.println(sb);
		
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb);
	}
}
