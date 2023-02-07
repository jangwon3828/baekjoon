import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
         int length = words.length;
        String[][] user=new String[length/n][n];
        int index=0;
        int answerUser=0;
        int answerIndex=0;
        HashSet<String>hs=new HashSet<>();
       a: for (int i = 0; i < length/n; i++) {
            for (int j = 0; j < n; j++) {
                user[i][j]=words[index];
                index+=1;
                if(index==1){
                    hs.add(words[index-1]);
                    continue;
                }
                if(words[index-2].charAt(words[index-2].length()-1) != words[index-1].charAt(0)
                        ||hs.contains(words[index-1])){
                    answerUser=i+1;
                    answerIndex=j+1;
                    break a;
                }
                hs.add(words[index-1]);
            }
        }
        int[] answer=new int[]{answerIndex,answerUser};
        return answer;
    }
}