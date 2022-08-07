import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int j=0;;j++) {
            String str = sc.nextLine();
            int count = 0;
            if(str.equals("#")) {
                break;
            }

            str = str.toLowerCase();

            for(int i=0; i<str.length(); i++) {
                switch(str.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count++;
                    default:
                        break;
                }
            }
            System.out.println(count);
        }
    }
}