import java.io.*;
import java.util.*;
class Main {
    static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(bf.readLine());
        array=new int[n+1];
        for(int i=1;i<=n;i++) {
            array[i]=array[i-1]+Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<m;i++) {
            st=new StringTokenizer(bf.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            System.out.println(array[b]-array[a-1]);
        }
    }
}