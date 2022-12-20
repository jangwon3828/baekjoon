import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int I = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= I; i++) {
			if (I % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}