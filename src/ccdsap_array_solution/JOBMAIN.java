package ccdsap_array_solution;
import java.util.*;
public class JOBMAIN {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            ArrayList<job> arr=new ArrayList<>();
            int max=0;
            for(int i=0;i<n;i++)
            {
                int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
                job obj=new job(a,b,c);
                arr.add(obj);
                if(max<b)
                    max=b;
            }
            int[] a=new int[max];
            Arrays.fill(a,-1);
            Collections.sort(arr);
            //System.out.println(arr);
            //System.out.println(max);
            for(int i=0;i<n;i++)
            {
                job obj=arr.get(i);
                int flag=obj.dt;
                while(flag!=0)
                {
                    if(a[flag-1]==-1)
                    {
                        a[flag-1]=obj.pro;
                        break;
                    }
                    flag--;


                }
            }
            int njob=0,price=0;
            for(int i=0;i<max;i++)
            {
                if(a[i]>-1)
                {
                    price+=a[i];
                    njob++;
                }
            }
            System.out.println(njob+" "+price);

        }
    }
}
