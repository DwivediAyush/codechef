package ccdsap_array_solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class GFG {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            ArrayList<finish> arr=new ArrayList<finish>();
            int n=s.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();
            for(int i=0;i<n;i++)
                b[i]=s.nextInt();
            for(int i=0;i<n;i++) {
                finish obj1=new finish(a[i],b[i],i+1);
                arr.add(obj1);
            }
            Collections.sort(arr);
            finish obj1=arr.get(0);
            finish obj2;
          // System.out.println(arr);
            System.out.print(obj1.no);
            for(int i=0;i<n-1;i++)
            {


                obj2=arr.get(i+1);

                if(obj1.end<=obj2.start)
                {
                    System.out.print(" "+obj2.no);
                    obj1=obj2;
                }
            }
            System.out.println();
        }
    }
}