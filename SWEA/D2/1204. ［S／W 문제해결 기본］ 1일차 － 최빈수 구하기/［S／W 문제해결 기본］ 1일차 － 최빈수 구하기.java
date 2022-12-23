import java.util.*;

class Solution{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++){
            int n = sc.nextInt();
            HashMap<Integer,Integer>hs=new HashMap<>();
            for (int i = 0; i < 1000; i++) {
                int score = sc.nextInt();
                hs.put(score,hs.getOrDefault(score,0)+1);
            }
            Integer max = Collections.max(hs.values());
            int score=0;
            for (int i = 0; i <= 100; i++) {
                if(hs.get(i)==max){
                    score=i;
                }
            }
            System.out.println("#"+n+" "+score);
        }
    }
}