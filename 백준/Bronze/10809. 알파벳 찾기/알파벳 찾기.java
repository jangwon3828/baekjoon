import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String line=sc.next();
        int[]iarr=new int[26];
        char[] carr=line.toCharArray();
        Arrays.fill(iarr,-1);
        for(int i=0;i<carr.length;i++)
        {
            if(iarr[carr[i]-97]==-1)
                iarr[carr[i]-97]=i;
        }
        for(int t=0;t<iarr.length;t++)
        {
            System.out.print(iarr[t]+" ");
        }
    }
}