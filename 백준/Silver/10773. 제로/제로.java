import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = Integer.parseInt(bf.readLine()); i > 0; i--) {
            int temp = Integer.parseInt(bf.readLine());
            if (temp == 0) {
                if (arr.size() == 0) {
                    continue;
                }
                arr.remove(arr.size() - 1);

            } else {
                arr.add(temp);
            }


        }
        int count = 0;
        for (int x = 0; x < arr.size(); x++) {
            count += arr.get(x);
        }
        System.out.println(count);

    }
}