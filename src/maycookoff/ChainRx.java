package maycookoff;
import java.util.*;

public class ChainRx {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int r=s.nextInt(),c=s.nextInt(),total=0;
            int[][] a=new int[r][c];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                    a[i][j]=s.nextInt();
            }

  int count=0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                { total=0;
                if(i-1>=0)
                    total++;
                if(j+1>=0)
                    total++;
                if(i+1<r)
                    total++;
                if(j+1<c)
                    total++;
                if(total>a[i][j])
                    count++;
                    System.out.println(count+" "+total);

                }

            }
            if(count==r*c)
                System.out.println("Stable");
            else
                System.out.println("Unstable");
        }
    }


}
