package ccdsap_array_solution;import java.util.*;

//import static jdk.vm.ci.meta.JavaKind.Int;

public class bracket {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int[] sto=new int[100000];
        int len=str.length();
        int i=0;
        int sub=0;
        int br=0;
        int k=0;
        Arrays.fill(sto,0);
        Stack<Character> st=new Stack<>();
        while(i<len)
        {
            if(str.charAt(i)==')'&&st.isEmpty())
                sub++;
            if(str.charAt(i)=='(')
                st.push(str.charAt(i));
            else if(str.charAt(i)==')'&&!st.isEmpty()&&st.peek()=='(')
            {
                br++;
                st.pop();
                if(st.isEmpty())
                {
                    sto[k]=br*2;
                    k++;
                    br=0;
                }

            }

i++;

        }
        Arrays.sort(sto);
        System.out.println(sto[sto.length-1]+" "+sub);
    }



}
