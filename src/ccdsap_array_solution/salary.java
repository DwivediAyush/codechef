package ccdsap_array_solution;
import java.util.*;
public class salary {
   public static long sumofall(long a[])
   {
       long temp=0;
        for(int i=0;i<a.length;i++)
            temp=temp+a[i];

       return temp;
   }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
             int n=s.nextInt();
             long[] a=new long[n];
             for(int i=0;i<n;i++)
                 a[i]=s.nextLong();
            Arrays.sort(a);
             long temp=a[0];
             long sum=sumofall(a);
            System.out.println(sum-n*temp);
        }
    }


}
