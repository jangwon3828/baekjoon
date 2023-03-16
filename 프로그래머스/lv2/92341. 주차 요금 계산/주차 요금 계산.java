import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] fees, String[] records) {
      Map<Integer,Integer> db=new HashMap<>();
       Map<Integer,Integer> check=new HashMap<>();

       for(String s:records){
           String[] data = s.split(" ");
           String[] times=data[0].split(":");
           int min=Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);
           Integer carName=Integer.parseInt(data[1]);
           String state=data[2];
           if(state.equals("IN")){
               check.put(carName,min);
           } else {
               Integer park = check.get(carName);
               check.remove(carName);
               int time=min-park;
               db.put(carName,db.getOrDefault(carName,0)+time);
           }
       }
       if(!check.isEmpty()){
           Object[] objects = check.keySet().toArray();
           for (Object a:objects){
               int carName = Integer.parseInt(a.toString());
               Integer time = 1439-check.get(carName);
               db.put(carName,db.getOrDefault(carName,0)+time);
           }
       }
        int size = db.size();
        int[] cars=new int[size];
        Object[] objects = db.keySet().toArray();
        for (int i = 0; i < size; i++) {
            cars[i]= (int) objects[i];
        }
        Arrays.sort(cars);
        int[] answer=new int[size];
        for (int i = 0; i < size; i++) {
            int plusTime=0;
            Integer parkingTime = db.get(cars[i]);
            if(parkingTime >fees[0]){
               int temp= (parkingTime-fees[0])%fees[2]==0?(parkingTime-fees[0])/fees[2]:(parkingTime-fees[0])/fees[2]+1;
                plusTime=temp*fees[3];
            }
            answer[i]=fees[1]+plusTime;
        }

     
        return answer;
    }
}