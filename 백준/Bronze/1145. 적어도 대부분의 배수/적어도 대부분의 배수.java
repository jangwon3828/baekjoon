import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int min = getMin(arr);
        int count = 0;
        
        while(true) {
            for(int i=0; i<arr.length; i++) {
                if(min%arr[i] == 0) {
                    count++;
                }
            }
            
            if(count >= 3) {
                break;
            } else {
                count = 0;
                min++;
            }
            
        }
        
        System.out.println(min);
    }
    
    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        
        return min;
    }
}