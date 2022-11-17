import java.util.ArrayList;
class Solution {
    public int solution(int[] ingredient) {
        if(ingredient.length<4) return 0;
        ArrayList<Integer> arr=new ArrayList<>();
        int j=0;
        int answer=0;
        for (int i = 0; i <= ingredient.length; i++) {
            if(arr.size()>=4){
                if(arr.get(j-1)==1&&arr.get(j-2)==3&&arr.get(j-3)==2&&arr.get(j-4)==1){
                    arr.subList(j - 4, j).clear();
                    j-=4;
                    answer++;
                }
            }
            if(ingredient.length==i)break;
            arr.add(ingredient[i]);
            j++;
        }
        return answer;
    }
}