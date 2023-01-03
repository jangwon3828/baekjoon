import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(s);
		String reverse = sb.reverse().toString();
		
		if(s.equals(reverse)) 
			System.out.println("1");
		else
			System.out.println("0");
	}
}