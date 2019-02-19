package janlunchtime;
import java.util.*;
public class watch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
         int n=s.nextInt();
         s.nextLine();
         String sc=s.nextLine();
         int flag=0;
         int in=0;
         for(int i=0;i<n;i++)
         {
             if(sc.charAt(i)=='1')
             {
                 flag++;
                 in=i;
             }
         }
         if(in%2==0)
         {
             System.out.println((n+1)/2-flag);
         }
         else
         {
             System.out.println(n/2-flag);
         }

        }

    }
}
