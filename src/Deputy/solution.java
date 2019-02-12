package Deputy;
import java.util.*;

class solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int f=-1;
            int n=s.nextInt();
            int [] a=new int[n];
            int [] d=new int[n];

            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            for(int i=0;i<n;i++)
                d[i]=s.nextInt();
            for(int i=0;i<n;i++)
            {
                if(i==0)
                {
                    if(a[n-1]<d[i]&&a[i+1]<d[i]&&(a[n-1]+a[i+1])<d[i])
                        f=d[i];
                }
                else if(i==n-1)
                {
                    if(a[0]<d[i]&&a[i-1]<d[i]&&(a[0]+a[i-1])<d[i]){
                        if(f<d[i])
                            f=d[i];
                    }
                }
                else
                {
                    if (a[i - 1] < d[i] && a[i + 1] < d[i] &&(a[i-1]+a[i+1])<d[i]){
                        if(f<d[i])
                            f=d[i];
                    }
                }
            }
            System.out.println(f);
        }
    }

}
