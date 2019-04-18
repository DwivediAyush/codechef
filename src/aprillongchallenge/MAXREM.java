package aprillongchallenge;
import java.util.*;
public class MAXREM {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        if(isSame(a))
            System.out.println(0);
        else
        {
            Arrays.sort(a);
            System.out.println(a[n-2]);
        }
    }

    private static boolean isSame(int[] a) {
        boolean response=true;

         for(int i=0;i<a.length-1;i++)
         {
             if(a[i]!=a[i+1])
             {
                 response=false;
                 break;

             }
         }


        return response;

    }

}
