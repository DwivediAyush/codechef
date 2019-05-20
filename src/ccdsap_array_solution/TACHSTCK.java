package ccdsap_array_solution;
import java.util.*;
public class TACHSTCK {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),l=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();

        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            int no=a[i];
            for(int j=i+1;j<n;j++)
            {
                if(Math.abs(a[i]-a[j])<=l&&a[i]>0&&a[j]>0)
                {
                    a[i]=-1;
                    a[j]=-1;
                    count++;
                    break;

                }
            }
        }
        System.out.println(count);
    }
}
