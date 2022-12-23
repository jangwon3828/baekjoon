import java.util.Scanner;

class Solution{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++){
            long money=0;
            int n = sc.nextInt();
            int[] price = new int[n];
            for(int i = 0; i<n; i++) {
                price[i] = sc.nextInt();
            }
            int max=0;
            for(int k = n-1 ; k>=0; k--) {
                
                if(max<price[k]){
                    max=price[k];
                    continue;
                }
                money = money - price[k] + max;

            }
            System.out.println("#"+test_case+" "+money);
        }
    }
}