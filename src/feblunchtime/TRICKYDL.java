package feblunchtime;
import java.io.*;
import java.util.*;

public class TRICKYDL {
    /*package whatever //do not write package name here */




        public static void main (String[] args) {
            Scanner s=new Scanner(System.in);
            int t=s.nextInt();

            while(t-->0)
            {
                long a=s.nextLong();
                int d=1;
                int d1=1,d2=1;
                long flag=0;
                long max=0;
                while(true)
                {
                    flag=flag+(long)Math.pow(2,d-1);
                    long fl=a*d-flag;
                    if(fl>=0)
                    {
                        d++;
                        d1=d;
                        if(max<fl)
                        {
                            max=fl;
                            d2=d;
                        }

                    }
                    else
                        break;

                }
                System.out.println((d1-1)+" "+(d2-1));
            }

        }

}
