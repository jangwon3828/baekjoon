import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		/** 1 **/
		int n = Integer.parseInt(bf.readLine());// 학생 수
		int[][] arr = new int[n][5];		// 행: 학생수, 열: 1~5학년
		int[] sameClassRoom = new int[n];	// 학생 별 같은 반이었던 학생 수 
		int maxStudent = 0;			// 같은 반이었던 학생 수 최댓값
		int answer = 0;
		
		/** 2 **/
		for(int i=0; i<n; i++) {	// 학생 수별로 1학년 ~ 5학년까지 몇 반에 속했었는지 입력
			st = new StringTokenizer(bf.readLine());
			for(int j=0; j<5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		/** 3 **/
		for(int i=0; i<n; i++) {
			Set<Integer> sameClass = new HashSet<>(); 

			for(int j=0; j<5; j++) {
				for(int k=0; k<n; k++) {
					if(arr[i][j] == arr[k][j] && k != i) {
						sameClass.add(k);
					}
				}
			}
			
			if(maxStudent < sameClass.size()) {
				maxStudent = sameClass.size();
				answer = i;
			}
		}
		
		System.out.println(answer+1);
		
		bf.close();
	}

}
