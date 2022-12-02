import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String>hs=new HashSet<>();

        for (int i = 0; i < n ; i++) {
            String name = sc.next();
            String status = sc.next();
            if(status.equals("enter")){
                hs.add(name);
            }
            if(status.equals("leave")){
                hs.remove(name);
            }
        }
        StringBuilder sb=new StringBuilder();
        ArrayList<String> members = new ArrayList<>(hs);
        Collections.sort(members);


        for (int i = members.size()-1; i >= 0; i--) {
            sb.append(members.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}

