import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int R = Integer.parseInt(inputs[0]);
        int C = Integer.parseInt(inputs[1]);
        int N = Integer.parseInt(inputs[2]);

        char[][] map = new char[R][C];
        int[][] bombtime = new int[R][C];

        for (int i = 0; i < R; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = tmp.charAt(j);
                if(map[i][j]=='O'){
                    bombtime[i][j] = 3; 
                }
            }
        }
        int time = 0;
        int[] mi = {1, -1, 0, 0};
        int[] mj = {0, 0, 1, -1};
        while(time++ < N) {
            if(time%2==0) {
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        if (map[i][j] == '.') {
                            map[i][j] = 'O';
                            bombtime[i][j] = time+3;
                        }
                    }
                }
            }else if(time%2==1) {
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        if (bombtime[i][j] == time) {
                            map[i][j] = '.';
                            for (int d = 0; d < 4; d++) {
                                int ni = i + mi[d];
                                int nj = j + mj[d];
                                if (ni < 0 || nj < 0 || ni >= R || nj >= C) continue;
                                if(map[ni][nj]=='O' && bombtime[ni][nj] != time) {
                                    map[ni][nj] = '.';
                                    bombtime[ni][nj] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < R; i++) {
            System.out.println(map[i]);
        }

    }
}