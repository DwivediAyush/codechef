package feblunchtime;
import java.io.*;
import java.util.*;

public class avg {/*package whatever //do not write package name here */



        public static void main (String[] args) {
            Scanner s=new Scanner(System.in);
            int t=s.nextInt();
            while(t-->0)
            {
                int n=s.nextInt(),k=s.nextInt(),v=s.nextInt();
                int sum=0;
                for(int i=0;i<n;i++)
                {
                    sum=sum+s.nextInt();

                }
                int i=1;
                int flag=sum;
                int avg=(n+k)*v;
                while(true)
                {
                    sum=flag+(i*k);
                    if(sum==avg)
                    {
                        System.out.println(i);
                        break;
                    }
                    else if(sum>=avg)
                    {
                        System.out.println("-1");
                        break;
                    }
                    else
                    {
                        i++;
                    }
                }

            }
        }

}
