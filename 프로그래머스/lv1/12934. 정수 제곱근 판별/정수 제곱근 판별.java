class Solution {
    public long solution(long n) {
        long answer = 0;
        long a= (int) Math.sqrt(n);
        if(a*a==n){
            answer=(a+1)*(a+1);
        }else{
            answer=-1;
        }
        return answer;
    }
}