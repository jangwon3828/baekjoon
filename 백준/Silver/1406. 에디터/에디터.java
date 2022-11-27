import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < line.length(); i++) {
            list.add(line.charAt(i));
        }
        ListIterator<Character> iter = list.listIterator();
        while(iter.hasNext()) {
            iter.next();
        }
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            char c = s.charAt(0);
            switch (c) {
                case 'L':
                    if(iter.hasPrevious())
                        iter.previous();

                    break;
                case 'D':
                    if(iter.hasNext())
                        iter.next();

                    break;
                case 'B':
                    //remove()는 next()나 previous()에 의해 반환된 가장 마지막 요소를 리스트에서 제거함
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    char ch = s.charAt(2);
                    iter.add(ch);

                    break;
                default:
                    break;
            }

        }
        StringBuilder sb = new StringBuilder();
        while(iter.hasPrevious()) {
            iter.previous();
        }
       while (iter.hasNext()){
           sb.append(iter.next());
       }
        System.out.println(sb.toString());
    }
}