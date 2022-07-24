import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<String> hs=new HashSet<>();
        String word=bf.readLine();
        String temp ="";
        for(int x=0;x<word.length();x++)
        {
            temp ="";
            for(int y=x;y<word.length();y++)
            {
                temp=word.substring(x,y+1);
                hs.add(temp);
            }
        }
        sb.append(hs.size());
        System.out.println(sb);
    }
}