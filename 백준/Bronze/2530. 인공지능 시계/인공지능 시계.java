import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        int plussec = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (plussec / 3600 > 0) {
            int temp = plussec / 3600;
            hour += temp;
            plussec -= 3600 * temp;
        }
        if (plussec / 60 > 0) {
            int temp = plussec / 60;
            min += temp;
            plussec -= 60 * temp;

        }
        if (plussec > 0) {
            sec += plussec;
        }
        if (sec >= 60) {
            sec -= 60;
            min++;
        }

        if (min >= 60) {
            min -= 60;
            hour++;
        }
        while(hour >= 24)
            hour -= 24;
        

        sb.append(hour).append(" ").append(min).append(" ").append(sec);
        System.out.println(sb);
    }
}
