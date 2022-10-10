import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader Object 생성
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer sb = new StringTokenizer(br.readLine());
        // 입력
        final int numA = Integer.parseInt(sb.nextToken());
        final int numB = Integer.parseInt(sb.nextToken());

        // 계산
        final double numP = 1 / (1 + Math.pow(10, (numB - numA) / 400.0));

        // 출력
        System.out.print(numP);
        // 생성된 BufferedReader 반환
        br.close();
    }
}