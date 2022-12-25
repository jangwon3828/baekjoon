import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double R = sc.nextDouble();
		sc.close();
		
		System.out.println(R * R * Math.PI);	
		System.out.println(2 * R * R);		
	}
}