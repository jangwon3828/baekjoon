import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nextInt = sc.nextInt();
        for (int i = 0; i < nextInt; i++) {
            ArrayList<Integer>arr=new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            int[] check=new int[3];
            check[0]=arr.get(1);
            check[1]=arr.get(2);
            check[2]=arr.get(3);
            int max = Arrays.stream(check).max().getAsInt();
            int min = Arrays.stream(check).min().getAsInt();
            if(max-min>=4){
                System.out.println("KIN");
            }else {
                System.out.println(Arrays.stream(check).sum());
            }
        }
    }
}
