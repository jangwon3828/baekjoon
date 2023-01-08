import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int m = sc.nextInt();
		int M = sc.nextInt(); 
		int T = sc.nextInt(); 
		int R = sc.nextInt(); 
		
		int res = 0; 
		int move = 0;
		int init_m = m; 
		
		while(move != N) {
			res++;
			
			if(m + T <= M) { 
				m += T;
				move++;
			} else {
				m -= R;
				
				
				if(m < init_m) m = init_m;
			}
			
			if((m + T > M) && (m == init_m))
				break;
		}
		
		if(move != N)
			System.out.println(-1);
		else
			System.out.println(res);
	}
}