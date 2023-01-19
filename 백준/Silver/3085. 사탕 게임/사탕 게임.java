import java.util.*;
import java.io.*;

public class Main {
    static char[][] arr;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String temp = bf.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = temp.charAt(j);
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 1 < n) {
                    char t = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = t;
                    int temp = check(arr);
                    if(temp>ans)
                        ans=temp;
                    arr[i + 1][j] = arr[i][j];
                    arr[i][j] = t;
                }
                if (j + 1 < n) {
                    char t = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = t;
                    int temp = check(arr);
                    if(temp>ans)
                        ans=temp;
                    arr[i][j + 1] = arr[i][j];
                    arr[i][j] = t;
                }

            }
        }
        System.out.println(ans);

    }

    public static int check(char[][] arr) {
        int re = 1;
        for (int i = 0; i < n; i++) {
            int temp = 1;
            for (int j =1; j < n; j++) {
                if (arr[i][j] == arr[i][j-1]) temp++;
                else temp=1;
                if (re < temp) re = temp;
            }
            temp = 1;
            for (int j = 1; j < n; j++) {
                if (arr[j][i] == arr[j-1][i]) temp++;
                else temp=1;
                if (re < temp) re = temp;
            }
        }
        return re;
    }
}
