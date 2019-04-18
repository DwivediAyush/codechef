package ccdsap_array_solution;

 import java.util.*;

public class rainbowa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int [] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();
           if(a[0]!=1)
               System.out.println("no");
           else
           {int i=0;
               for(i=0;i<n/2;)
               {
                   if((a[i]<=7)&&(a[n-1-i]==a[i])&&(a[i+1]-a[i])<=1)
                       i++;
                   else {
                       System.out.println("no");
                       break;
                   }
               }
               if(i==n/2 && a[i]==7)
                   System.out.println("yes");

           }

        }
    }
}
