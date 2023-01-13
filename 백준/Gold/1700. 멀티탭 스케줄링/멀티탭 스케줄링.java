import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] order = new int[K];

        for (int i = 0; i < K; i++) {
            order[i] = sc.nextInt();
        }

        boolean[] use = new boolean[101];
        int put = 0;
        int ans = 0;
        for (int i = 0; i < K; i++) {
            int temp = order[i];

            if (!use[temp]) {
                if (put < N) {
                    use[temp] = true;
                    put++;
                } else {
                    ArrayList<Integer> arrList = new ArrayList<>();
                    for (int j = i; j < K; j++) {
                        if (use[order[j]] && !arrList.contains(order[j])) {
                            arrList.add(order[j]);
                        }
                    }

                    if (arrList.size() != N) {
                        for (int j = 0; j < use.length; j++) {
                            if (use[j] && !arrList.contains(j)) {
                                use[j] = false;
                                break;
                            }
                        }
                    } else {
                        int remove = arrList.get(arrList.size() - 1);
                        use[remove] = false;
                    }

                    use[temp] = true;
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

}