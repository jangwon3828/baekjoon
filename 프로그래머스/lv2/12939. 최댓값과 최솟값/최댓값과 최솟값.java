import java.util.*;
class Solution {
    public String solution(String s) {
        String answer="";
        String[] sarr= s.split(" ");
        int n=sarr.length;
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= Integer.parseInt(sarr[i]);
        }
        Arrays.sort(arr);
        answer=arr[0]+" "+arr[n-1];
        return answer;
    }
}