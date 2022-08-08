import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[26];
        String t = s.next();
        for (int i = 0; i < t.length(); i++) {
            a[(int) t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(a[i] + " ");
        }
    }
}