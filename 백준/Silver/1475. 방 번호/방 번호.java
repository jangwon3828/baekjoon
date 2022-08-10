import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] numSet = new int[10];
        for(char c : s.toCharArray()) {
            int num = c - '0';
            if(num==9) {
                num = 6;
            }
            numSet[num]++;
        }
        numSet[6] = numSet[6]/2 + numSet[6]%2;

        Arrays.sort(numSet);
        System.out.println(numSet[9]);
    }
}