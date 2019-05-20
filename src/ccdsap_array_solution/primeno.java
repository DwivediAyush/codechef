package ccdsap_array_solution;
import java.math.BigInteger;
import java.util.*;
public class primeno {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        long m=0;
        while(true)
        {
            long ans=a*m*m+b*m+c;
            BigInteger ch;
            ch=BigInteger.valueOf(ans);
            if(ans<2)
            {
                System.out.println(m);
                break;
            }
            if(!ch.isProbablePrime(1))
            {
                System.out.println(m);
                break;
            }
            else
            {
                m++;
            }


        }
    }


}
