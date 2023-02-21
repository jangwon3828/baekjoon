import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
       HashMap<String,Integer> hm=new HashMap<>();
        int clothe = clothes.length;
        for (int i = 0; i < clothe; i++) {
            hm.put(clothes[i][1],hm.getOrDefault(clothes[i][1],0)+1);
        }
        Object[] objects = hm.values().toArray();
        int temp=1;
       
           temp=1;
           for (int i = 0; i < objects.length; i++) {
               temp*=(int)objects[i]+1;
           }
          
       
        return temp-1;
    }
}