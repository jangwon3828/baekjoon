import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
       Map<String, String> names = new HashMap<>();
        int change = 0;
        for (String data : record) {
            String[] temp = data.split(" ");
            String state = temp[0];
            String userId = temp[1];
            if (state.equals("Leave")) {
               continue;
            } else if (state.equals("Change")) {
                change += 1;
            } 
            String userName = temp[2];
            names.put(userId, userName);
        }
        int size = record.length - change;
        String[] answer = new String[size];
        int idx=0;
        for (int i = 0; i < record.length; i++) {
            String[] data = record[i].split(" ");
            String state = data[0];
            String userName = names.get(data[1]);
            if(state.equals("Enter")){
                answer[idx++] = userName + "님이 들어왔습니다.";
            } else if (state.equals("Leave")) {
                answer[idx++] = userName + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}