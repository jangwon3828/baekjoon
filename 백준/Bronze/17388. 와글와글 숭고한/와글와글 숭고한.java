import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		int sum = S + K + Y;
		//최솟갑 구하기
		int min = Math.min(S, K);
		min = Math.min(min, Y);
		
		if(sum >= 100) {
			System.out.println("OK");
		}else {
			if(min == S) {
				System.out.println("Soongsil");
			}else if(min == K) {
				System.out.println("Korea");
			}else {
				System.out.println("Hanyang");
			}
		}
		
	}

}