import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] alpha = new int[26];
		ArrayList<Character> al = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			String s = sc.next();
			int index = s.charAt(0) - 97; 
			alpha[index]++;
			
			if(alpha[index] >= 5) {
				if(!al.contains((char)(index+97))) {
					al.add((char)(index+97));
				}
			}
		}
		
		if(al.size() == 0) {
			System.out.print("PREDAJA");
		} else {
			Collections.sort(al);
			for(int i=0; i<al.size(); i++) {
				System.out.print(al.get(i));
			}
		}
	}
}