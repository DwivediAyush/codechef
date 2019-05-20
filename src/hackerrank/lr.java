package hackerrank;
import java.util.*;
public class lr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long[] b=new long[n];
        long[] area=new long[n];
        Arrays.fill(area,-1);
        for(int i=0;i<n;i++)
            b[i]=s.nextLong();
        for(int i=0;i<n;i++)
        {    int count=0;
            for(int j=0;j<n;j++)
            {
                if(b[i]<=b[j])
                    count++;
                else if(i>j&&b[i]>b[j]) {
                    count = 0;
j=i;
                }else
                   break;
            }
           // System.out.print(count+ " ");
            area[i]=count*b[i];
            //System.out.println(area[i]);
        }
        Arrays.sort(area);
        System.out.println(area[n-1]);

    }
}
