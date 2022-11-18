import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
       Map<String,ArrayList<String>>reportUserMap=new HashMap<>();

        int[] id_lists=new  int[id_list.length];


        for (String  s: report) {
            String[] s1 = s.split(" "); //신고자랑 신고당한사람 값얻음
            ArrayList<String> sets = reportUserMap.get(s1[1]);
            if(sets == null){
                sets=new ArrayList<>();
            }
            sets.add(s1[0]);
            reportUserMap.put(s1[1],sets);
        }
        for (String s : reportUserMap.keySet()) {
            ArrayList<String> strings = reportUserMap.get(s);
            Set<String> set = new HashSet<String>(strings);
            strings =new ArrayList<String>(set);
            reportUserMap.put(s,strings);
        }


        for (String s : reportUserMap.keySet()) {
            ArrayList<String> sets = reportUserMap.get(s);
            if(sets.size()>=k){
                for (String s1 : sets) {
                    int length = id_list.length;
                    for (int i = 0; i < length; i++) {
                        if(id_list[i].equals(s1)){
                            id_lists[i]++;
                        }
                    }
                }
            }
        }
        return id_lists;

    }
}