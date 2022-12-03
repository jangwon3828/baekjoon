import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] opList = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
        int[] count = new int[7];
        double total = 0;
        String data = "";
        while ((data = br.readLine()) != null) {
            String[] arr = data.split(" ");
            total += arr.length;

            for (int i = 0; i < arr.length; i++) {
                String op = arr[i];
                for (int j = 0; j < 7; j++) {
                    if (op.equals(opList[j])) {
                        count[j]++;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s %d %.2f\n", opList[i], count[i], count[i] / total);
        }
        System.out.printf("%s %d %.2f\n", "Total", (int) total, 1.00);

    }
}

