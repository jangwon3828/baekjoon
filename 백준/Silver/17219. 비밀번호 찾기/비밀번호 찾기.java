import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        HashMap<String ,String>hs=new HashMap<>();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();
            hs.put(key,value);
        }
        for (int i = 0; i < N; i++) {
            String readLine = br.readLine();
            System.out.println(hs.get(readLine));
        }
    }
}