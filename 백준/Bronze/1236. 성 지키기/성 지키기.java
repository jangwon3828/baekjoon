import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int row = 0;	
        int col = 0;	
        char[][] map = new char[n][m];
        for(int i=0; i<map.length; i++) {
            String str = sc.next();
            for(int j=0; j<map[i].length; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for(int i=0; i<n; i++) {
            boolean flag = true;
            for(int j=0; j<m; j++) {
                if(map[i][j] == 'X') {
                    flag = false;
                    break;
                }
            }
            if(flag)
                row ++;
        }

        for(int i=0; i<m; i++) {
            boolean flag = true;
            for(int j=0; j<n; j++) {
                if(map[j][i] == 'X') {
                    flag = false;
                    break;
                }
            }
            if(flag)
                col ++;
        }
        System.out.println(Math.max(row, col));
    }
}
