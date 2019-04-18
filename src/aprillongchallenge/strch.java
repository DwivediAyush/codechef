package aprillongchallenge;
import java.util.*;


public class strch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t;
        t=s.nextInt();

        while(t-->0)
        {
           int l=s.nextInt();
            s.nextLine();
            String str1=s.nextLine();
            String str2=s.nextLine();
            long nop=(l*(l+1))/2;
            int [] a=new int[26];
            int temp=0;
            Arrays.fill(a,0);
            for(int i=0;i<l;i++)
            {
                if(str1.charAt(i)==str2.charAt(0));
                else
                {    int f=str1.charAt(i)-'a';
                    a[f]+=1;
                    temp++;
                }

            }
            long fact=factor(temp);
            Arrays.sort(a);
            long flag=1;
            for(int i=25;i>=0;i--)
            {
                if(a[i]>1) {
                    long temp1 = factor(a[i]);
                    flag = flag * temp1;
                }
                else
                    break;
            }
            fact=(fact/flag);
            System.out.println(nop-fact);

        }
    }

    private static long factor(int temp) {
        long s=1;
        while(temp!=0)
        {
            s=s*temp;
            temp--;
        }
        return s;

    }
}
