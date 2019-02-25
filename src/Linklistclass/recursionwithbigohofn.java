
package Linklistclass;

import java.sql.SQLOutput;
import java.util.Arrays;

public class recursionwithbigohofn {
   static long[] m=new long[101];

    public static long recu(int a) {
      if(a<=1)
          return a;
      if(m[a]==-1) {
          m[a] = recu(a-2)+recu(a-1);
      }
      else
      return m[a];

      return recu(a-2)+recu(a-1);
    }




    public static void main(String[] args) {
        long tstra=System.nanoTime();
        Arrays.fill(m,-1);
        System.out.println(recu(50));
        long tf=System.nanoTime();
        System.out.println(tf-tstra);
    }
}
