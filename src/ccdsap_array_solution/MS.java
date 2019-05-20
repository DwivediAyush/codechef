package ccdsap_array_solution;
import java.util.*;
public class MS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int[] a=new int[26];
        int i=0;
        Arrays.fill(a,0);
        while(i<st.length())
        {
            a[st.charAt(i)-'a']++;
        }
int max=0;
        for(int j=25;j>=0;j--)
        {
            if(a[j]==1)
            {
                max=j;
                break;
            }
        }
        String t=new String();
        int ans=0;
        while(st.length()>0)
        {
            if(t.length()>0&&t.charAt(t.length()-1)-'a'<=max)
            {
                ans+=t.charAt(t.length()-1);
                  t=t.substring(1,t.length()-1);
            }
            else
            {
                if(max+'a'==st.charAt(0))
                {
                    a[max]--;
                    ans+=st.charAt(0);

                }
            }
        }

    }
}
