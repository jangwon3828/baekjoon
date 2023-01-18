import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> agentList = new ArrayList<>();
        for (int i=1;i<6;i++){
            if(br.readLine().contains("FBI")){
                agentList.add(i);
            }
        }
        if(agentList.isEmpty()){
            System.out.print("HE GOT AWAY!");
        } else {
            StringBuilder sb = new StringBuilder();
            agentList.forEach(i->sb.append(i).append(" "));
            sb.setLength(sb.length()-1);
            System.out.print(sb);
        }
    }
}