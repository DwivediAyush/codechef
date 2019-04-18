package ccdsap_array_solution;
import java.util.*;
public class solution {

    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String mo=s.nextLine();
        long sum=0;
        Stack<String> stack=new Stack<String>();
        for(int i=0;i<mo.length();i++)
        {
            if(mo.charAt(i)==')')
            {
                long su=0;
                while(!stack.empty()&&stack.peek().compareTo("(")!=0)
                {
                    String ch=stack.pop();
                    if(ch.compareTo("C")==0)
                        su=su+12;
                    else if(ch.compareTo("H")==0)
                        su=su+1;
                    else if(ch.compareTo("O")==0)
                        su=su+16;
                    else
                    {
                        Integer  ir=Integer.parseInt(stack.pop());
                        su=su+ir;
                    }
                }
                stack.pop();
                stack.push(Long.toString(su));
            }
            else if(Character.getNumericValue(mo.charAt(i))>0&&Character.getNumericValue(mo.charAt(i))<10)
            {
                Long fa=Long.parseLong(stack.pop());
                fa=fa*Character.getNumericValue(mo.charAt(i));
                stack.push(Long.toString(fa));

            }
            else
            {
                stack.push(Character.toString(mo.charAt(i)));
            }
        }
        long su=0;
        while(!stack.empty())
        {


            while(!stack.empty()&&stack.peek().compareTo("(")!=0)
            {
                String ch=stack.pop();
                if(ch.compareTo("C")==0)
                    su=su+12;
                else if(ch.compareTo("H")==0)
                    su=su+1;
                else if(ch.compareTo("O")==0)
                    su=su+16;
            }
        }
        System.out.println(su);
    }
}
