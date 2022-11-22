import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
         int answer = 0;
        int arrLength = board[0].length;
        int length1 = moves.length;
        Stack<Integer> stack=new Stack<>();
        Loop1: for (int i = 0; i <length1; i++) {
            int move = --moves[i];
            for (int j = 0; j < arrLength; j++) {
                if(board[j][move]==0){
                    continue;
                }
                int game = board[j][move];
                board[j][move]=0;
                if(stack.size()!=0){
                    if(stack.peek()==game){
                        answer+=2;
                        stack.pop();

                        continue Loop1;
                    }
                }

                stack.push(game);
                continue Loop1;
            }

        }
        return answer;
    }
}