import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		char[] input = bfr.readLine().toCharArray();
		int inputLength = input.length;
		int height = 10;
		boolean direction;
		direction = input[0] == '(' ? true : false;
		for (int i = 1; i < inputLength; i++) {
			if (direction && input[i] == ')') {
				height += 10;
				direction = false;
			} else if(direction && input[i] == '('){
				height += 5;
				direction = true;
			} else if(!direction && input[i] =='('){
				height += 10;
				direction = true;
			} else { 
				height += 5;
				direction = false;
			}
		}
		System.out.println(height);
		bfr.close();
	}
}