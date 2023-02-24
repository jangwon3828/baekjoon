import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int[] alphabet = new int[26];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] first = br.readLine().toCharArray();
		char[] seccond = br.readLine().toCharArray();
		
		for (char c : first) 	alphabet[c-97]+=1;
		for (char c : seccond) 	alphabet[c-97]-=1;
		
		int result = 0;
		result = Arrays.stream(alphabet).map(v -> {
			return Math.abs(v); 
		}).sum();
		System.out.println(result);
	}

}