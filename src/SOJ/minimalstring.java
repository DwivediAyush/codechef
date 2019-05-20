package SOJ;
import java.util.*;

import static java.lang.System.*;

public class minimalstring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );

            String s=sc.nextLine();
            int len=s.length();
char[] ans=new char[len+1];
ans[len]='Z';
char[]  q=new char[len+1];
for(int i=len-2;i>=0;i--)
{
   if(s.charAt(i)-s.charAt(i+1)>0)
       ans[i]=s.charAt(i);
   else
       ans[i]=s.charAt(i+1);

}int current=0;
int top=0;
Arrays.fill(q,'a');
while(current<len) {
    if (top != 0 || ans[current] < q[top]) {
        q[++top] = s.charAt(current++);
    } else {
        System.out.print(q[top]);
     top--;
    }
    if(top==0)
        break;
}


        }
    }






