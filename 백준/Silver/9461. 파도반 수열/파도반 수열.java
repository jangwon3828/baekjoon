import java.util.Scanner;
 
public class Main {
	
	public static Long[] arr = new Long[101];
 
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		arr[0] = 0L;
		arr[1] = 1L;
		arr[2] = 1L;
		arr[3] = 1L;
		
		int T = in.nextInt();
		
		while(T-- > 0) {
			int N = in.nextInt();
			System.out.println(padovan(N));
		}
		
	}
	
	public static long padovan(int N) {
		if(arr[N] == null) {	
			arr[N] = padovan(N - 2) + padovan(N - 3);
		}
		return arr[N];
	}
 
}