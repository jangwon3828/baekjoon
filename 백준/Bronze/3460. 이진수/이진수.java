import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            String binaryString = Integer.toBinaryString(sc.nextInt());
            for (int j = binaryString.length()-1,k=0; j >=0 ; j--,k++) {
                if(binaryString.charAt(j)=='1') sb.append(k).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
