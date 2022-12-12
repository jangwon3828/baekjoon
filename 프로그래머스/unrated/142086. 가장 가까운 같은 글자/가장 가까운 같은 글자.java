import java.util.*;
class Solution {
    public int[] solution(String s) {
      HashMap<Character,Integer>hs=new HashMap<>();
        int len=s.length();
        int[] answer = new int[len];
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(hs.containsKey(c)){
                answer[i]= i-hs.get(c);
                hs.put(c,i);
            } else{
                hs.put(c,i);
                answer[i]=-1;
            }
        }

        
        return answer;
    }
}