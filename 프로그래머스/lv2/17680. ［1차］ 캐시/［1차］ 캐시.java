import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
      int size = cities.length;
        if (cacheSize == 0) {
           return (size * 5) ;
        }

        for (int i = 0; i < size; i++) {
            cities[i] = cities[i].toLowerCase();
        }
        Queue<String> queue = new LinkedList<>();
        int time = 0;

        if (cacheSize > size) {
            for (int i = 0; i < size; i++) {
                if (queue.contains(cities[i])) {
                    time += 1;
                    queue.remove(cities[i]);
                    queue.offer(cities[i]);
                    continue;
                }
                time+=5;
                queue.add(cities[i]);
            }
                    return time;
        }
        time = 0;
        queue.clear();
        int index=0;
        for (int i = 0; i < size; i++) {
            if(queue.size()==cacheSize){
                index=i;
                break;
            }
            if (queue.contains(cities[i])) {
                time += 1;
                queue.remove(cities[i]);
                queue.offer(cities[i]);
                continue;
            }
            time+=5;
            queue.add(cities[i]);
        }
        for (int i = index; i < size; i++) {
            if (queue.contains(cities[i])) {
                time += 1;
                queue.remove(cities[i]);
                queue.offer(cities[i]);
                continue;
            }
            time+=5;
            queue.poll();
            queue.add(cities[i]);
        }
         return time;
      
       
    }
}