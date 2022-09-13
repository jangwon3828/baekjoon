class Solution {
    public int[] solution(long n) {
        
        String s=String.valueOf(n);
        int lo=s.length();
        int[] answer = new int[lo] ;
        for(int i=0;i<lo;i++){
            answer[i]=s.charAt(lo-i-1)-48;
        }
        return answer;
    }
}