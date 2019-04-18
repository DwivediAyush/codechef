package aprillongchallenge;
import java.util.*;
public class maxrem2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        Arrays.sort(a);
        int max=a[n-1];
        for(int i=0;i<n;i++)
        {
            a[i]=a[i]%max;
        }
        Arrays.sort(a);
        System.out.println(a[n-1]);
    }
}
