import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] alphabet = new int[26];
 
        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    alphabet[str.charAt(i) - 'a']++;
                }
            }
        }
 
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
            }
        }
 
        for (int i = 0; i < 26; i++) {
            if (max == alphabet[i]) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}