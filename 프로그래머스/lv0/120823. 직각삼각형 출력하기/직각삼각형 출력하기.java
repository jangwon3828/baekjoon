import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = "*";
    String star = "*";
    for(int i = 0; i < n; i++) {
      System.out.println(str);
      str = str.concat(star);
    }
    }
}