import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int friendsLenght = friends.length;
        HashMap<String, Integer> dic = new HashMap<>();
        int[] giftDegree = new int[friendsLenght];
        int[][] giftGraph = new int[friendsLenght][friendsLenght];
        
        for ( int i = 0; i < friendsLenght; i++ ) {
            dic.put(friends[i], i);
        }
        
        for ( String gift : gifts ) {
            String[] giftName = gift.split(" ");
            giftDegree[dic.get(giftName[0])]++;
            giftDegree[dic.get(giftName[1])]--;
            giftGraph[dic.get(giftName[0])][dic.get(giftName[1])]++;    
        }
        
        for ( int i =0; i< friendsLenght; i++) {
            int num = 0;
            for ( int j = 0; j< friendsLenght; j++) {
                if ( i == j) {
                    continue;
                }    
                
                if (giftGraph[i][j] > giftGraph[j][i] ||
                     (giftGraph[i][j] == giftGraph[j][i] && giftDegree[i] > giftDegree[j])) {
                        num++;
                    }
            }
            
            if ( answer < num) {
                answer = num;
            }
            
        }
        
        return answer;
    }
}