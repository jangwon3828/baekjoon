class Solution {
    public int solution(int[] nums) {
        boolean[] check=new boolean[3003];
        check[0]=true;
        check[1]=true;
        for (int i = 2; i < 3000; i++) {
            for (int j = 2; j < 3000; j++) {
                if(i*j>3000)break;
                check[i*j]=true;
            }
        }
        int answer=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k =j+1; k < nums.length; k++) {
                   if(check[nums[i]+nums[j]+nums[k]]) continue;
                   else answer++;
                }
            }
        }

        return answer;
    }
}