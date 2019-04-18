package SOJ;
import java.util.*;
public class JNEXT{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();
            int sum=0;
            for(int i=0;i<n;i++)
                sum=sum*10+a[i];
           int sum1=0;
            for(int i=2;i<n;i++)
            {
                sum1=0;
                sum1=sumof(sum,i);
                //System.out.println(sum1);
               if(sum1>sum)
                   break;
               else
                   sum1=-1;
            }
            System.out.println(sum1);

        }

    }

    private static int sumof(int s, int i) {
      int sum=0;
      int t=1;
      int pre=0 ;
      int s1=s;
      int next=0;
        int rem=0;
      if(i>2)
      rem=s%(int)Math.pow(10,i-2);
      while(t<=i)
      {
          pre=next;
          next=s%10;
          s=s/10;
          t++;

      }
      if(i==2)
      {
          sum=(s*10+pre)*10+next;
      }
      else
      {
          sum=((s*10+pre)*10+next)*(int)Math.pow(10,i-2)+rem;
      }


      return sum;
    }
}