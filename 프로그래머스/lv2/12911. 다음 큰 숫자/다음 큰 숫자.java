class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = Integer.toBinaryString(n);
        int nCnt = 0;

        for(int i = 0; i < nStr.length(); i++){
            if(nStr.charAt(i) == '1') nCnt++; 
         }
        
        for(int i = n+1; ; i++){
            String temp = Integer.toBinaryString(i);
            int nextNumCnt = 0;
            for(int j = 0; j < temp.length(); j++){
                if(temp.charAt(j) == '1') nextNumCnt++; 
            }
            
            if(nextNumCnt == nCnt) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}