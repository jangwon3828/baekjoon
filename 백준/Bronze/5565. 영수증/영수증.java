import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int answer = sc.nextInt();
        for (int i = 0; i < 9; i++) {
            answer-=sc.nextInt();
        }
        System.out.println(answer);
    }
}