import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int ASize = A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int j=0;
        int answer=0;
        for (int i = 0; i < ASize; i++) {
            if(B[i]>A[j]){
                j++;
                answer++;
            }
        }
        return answer;
    }
}