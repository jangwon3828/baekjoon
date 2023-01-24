import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double result = Math.pow(c, 2) / (Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println((int)Math.sqrt(result * Math.pow(a, 2)) + " " + (int)Math.sqrt(result * Math.pow(b, 2)));
		
	}
}