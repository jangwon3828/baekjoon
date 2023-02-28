import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int room = 0;
		
		int[][] student = new int[7][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());	
			int b = Integer.parseInt(st.nextToken());	
			if(a == 0) student[b][0] ++;
			else 	student[b][1] ++;     
		}
		
		for(int i=1; i<student.length; i++) {
			for(int j=0; j<student[i].length; j++) {
				if(student[i][j] == 0)	continue;	
				room += student[i][j] / K;	
				if(student[i][j] % K != 0)	
					room += 1;
			}
		}
		System.out.println(room);
	}

}