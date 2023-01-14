import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String firstString, secondString;
    static int pi[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        firstString = br.readLine();
        secondString = br.readLine();
        pi = new int[secondString.length()];

        System.out.println(KMP());
    }

    static int KMP() {

        int j = 0;

        for (int i = 1; i < secondString.length(); ++i) {
            while (j > 0 && secondString.charAt(i) != secondString.charAt(j)) j = pi[j - 1];
            if (secondString.charAt(i) == secondString.charAt(j)) pi[i] = ++j;
        }

        j = 0;
        for (int i = 0; i < firstString.length(); ++i) {
            while (j > 0 && firstString.charAt(i) != secondString.charAt(j)) j = pi[j - 1];
            if (firstString.charAt(i) == secondString.charAt(j)) {
                if (j == secondString.length() - 1) {
                    return 1;
                }
                else ++j;
            }
        }
        return 0;
    }

}