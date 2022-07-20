import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        while (true) {
            ArrayList<Character> chars = new ArrayList<Character>();
            String str = sc.nextLine();
            if (str.equals(".")) {
                System.out.println(sb);
                System.exit(0);
            }
            for (int x = 0; x < str.length(); x++) {
                try {
                    if (str.charAt(x) == '.' && chars.size() == 0) {
                        sb.append("yes").append("\n");
                        break;
                    } else if (str.charAt(x) == '.' && chars.size() != 0) {
                        sb.append("no").append("\n");
                        break;
                    }
                    if (str.charAt(x) == '(') {
                        chars.add(str.charAt(x));
                    }
                    if (str.charAt(x) == '[') {
                        chars.add(str.charAt(x));
                    }
                    if (str.charAt(x) == ']' && chars.get(chars.size() - 1) != ('[')) {
                        sb.append("no").append("\n");
                        break;
                    }
                    if (str.charAt(x) == ']' && chars.get(chars.size() - 1) == ('[')) {
                        chars.remove(chars.size() - 1);
                    }
                    if (str.charAt(x) == ')' && chars.get(chars.size() - 1) != ('(')) {
                        sb.append("no").append("\n");
                        break;
                    }
                    if (str.charAt(x) == ')' && chars.get(chars.size() - 1) == ('(')) {
                        chars.remove(chars.size() - 1);
                    }
                } catch (Exception ex) {
                    sb.append("no").append("\n");
                    break;
                }
            }

        }
    }
}