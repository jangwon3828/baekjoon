import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String temp = new BufferedReader(new InputStreamReader(System.in)).readLine();
        double answer = 0;
        switch (temp) {
            case "A+":
                answer = 4.3;
                break;
            case "A0":
                answer = 4.0;
                break;
            case "A-":
                answer = 3.7;
                break;
            case "B+":
                answer = 3.3;
                break;
            case "B0":
                answer = 3.0;
                break;
            case "B-":
                answer = 2.7;
                break;
            case "C+":
                answer = 2.3;
                break;
            case "C0":
                answer = 2.0;
                break;
            case "C-":
                answer = 1.7;
                break;
            case "D+":
                answer = 1.3;
                break;
            case "D0":
                answer = 1.0;
                break;
            case "D-":
                answer = 0.7;
                break;
            case "F":
                answer = 0.0;
                break;
        }
        System.out.println(answer);

    }
}