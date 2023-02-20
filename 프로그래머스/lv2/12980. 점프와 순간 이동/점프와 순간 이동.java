import java.util.*;

public class Solution {
    public int solution(int n) {
         int answer=0;
        while (n>0){
            if(n%2==1){
                answer=answer+1;
                n-=1;
                continue;
            }
           else{
               n/=2;
           }
        }
        return answer;
    }
}