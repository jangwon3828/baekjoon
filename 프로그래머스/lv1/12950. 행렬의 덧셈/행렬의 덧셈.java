class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
         int [][] answer=new int[arr1.length][arr1[0].length];
        int length = arr1.length;
        for (int i = 0; i < length; i++) {
            int length1 = arr1[i].length;
            for (int j = 0; j < length1; j++) {
                answer[i][j]=arr2[i][j]+arr1[i][j];
            }
        }return answer;
    }
}