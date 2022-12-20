import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int count = 0;
		for (int tc = 0; tc < num; tc++) {
			int[] team = new int[3];
			st = new StringTokenizer(br.readLine());

			int sum = 0;
			boolean isPass = true;
			for (int i = 0; i < 3; i++) {
				int n = Integer.parseInt(st.nextToken());
				team[i] = n;
				sum += n;
				if (n < M)
					isPass = false;
			}

			if (isPass) {
				if (sum >= S) {
					count++;
					sb.append(team[0] + " ");
					sb.append(team[1] + " ");
					sb.append(team[2] + " ");
				}
			}
		}

		System.out.println(count);
		System.out.println(sb);
	}
}