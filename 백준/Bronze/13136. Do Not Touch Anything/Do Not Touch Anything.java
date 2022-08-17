import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double R = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		double N = Double.parseDouble(st.nextToken());
		
		long RCCTV = (long) Math.ceil(R / N);
		long CCCTV = (long) Math.ceil(C / N);
		long CCTV = RCCTV * CCCTV;
		
		System.out.println(CCTV);
	}

}