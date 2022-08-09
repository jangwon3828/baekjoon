import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sarr = new String[3];
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                sarr[0] = s.substring(0, i);
                sarr[1] = s.substring(i, j);
                sarr[2] = s.substring(j);
                StringBuilder temp = new StringBuilder();
                for (int t = 0; t < 3; t++) {
                    temp.append(new StringBuilder().append(sarr[t]).reverse());
                }
                ans.add(temp.toString());
            }
        }
        Collections.sort(ans);
        System.out.println(ans.get(0));

    }
}


