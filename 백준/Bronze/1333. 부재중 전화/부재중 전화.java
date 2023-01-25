import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        ArrayList<Boolean> sec = new ArrayList<Boolean>();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < l; j++) { 
                sec.add(true);
            }
            
            if(i != n-1) {
                for(int j = 0; j < 5; j++) {   
                    sec.add(false);
                }
            }
        }
        
        int result = 0;
        while(result < sec.size()) {    
            if(sec.get(result) == false) {
                break;
            }
            result += d;    
        }
        System.out.println(result);
        
        
    }
 
}