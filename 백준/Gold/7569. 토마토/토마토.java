import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int [][][] map=new int[z1][y1][x1];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < z1; i++) {
            for (int j = 0; j < y1; j++) {
                for (int k = 0; k < x1; k++) {
                    map[i][j][k]=sc.nextInt();
                    if(map[i][j][k]==1)
                        queue.add(new int[]{i,j,k});
                }
            }
        }
        int[] dx=new int[]{0,0,0,0,1,-1};
        int[] dy=new int[]{0,0,1,-1,0,0};
        int[] dz=new int[]{1,-1,0,0,0,0};
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int nowX = poll[2];
            int nowY = poll[1];
            int nowZ = poll[0];
            for (int i = 0; i < 6; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                int nextZ = nowZ + dz[i];
                if (nextX < 0 || nextY < 0 || nextZ < 0 || nextY >= y1 || nextX >= x1|| nextZ >= z1) continue;
                if (map[nextZ][nextY][nextX] == 0) {
                    queue.add(new int[]{nextZ, nextY,nextX});
                    map[nextZ][nextY][nextX] = map[nowZ][nowY][nowX] + 1;
                }
            }
        }
        int result = Integer.MIN_VALUE;
        a: for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                for (int k = 0; k < z1; k++) {
                    if(map[k][j][i]==0){
                        result=0;
                        break a;
                    }
                    result = Math.max(map[k][j][i], result);
                }
            }
        }
        System.out.println(result-1);
    }
}