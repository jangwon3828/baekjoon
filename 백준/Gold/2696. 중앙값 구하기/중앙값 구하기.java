import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       StringBuilder sb=new StringBuilder();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            sb.append(t/2+1).append("\n");
            ArrayList<Integer>arr=new ArrayList<>();
            for (int j = 0; j < t; j++) {
                int num = sc.nextInt();
                arr.add(num);
                if(j%2==0){
                    Collections.sort(arr);
                    sb.append(arr.get(j/2)).append(" ") ;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
