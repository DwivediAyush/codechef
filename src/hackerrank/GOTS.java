package hackerrank;

import java.util.*;

public class GOTS {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {

int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();

int[] sa=new int[a];
int[] sb=new int[b];
for(int i=0;i<a;i++)
    sa[i]=sc.nextInt();
for(int i=0;i<b;i++)
    sb[i]=sc.nextInt();
int sum=0,l=0,count=0,i=0,j=0,flag=0;
while(i<a&& sum+sa[i]<=c)
{
    sum+=sa[i];
    i++;
}
count=i;
while(j<b&&i>=0)
{
    sum+=sb[j];
   j++;
   while(sum>c&&i>0)
   {i--;
       sum-=sa[i];
   }
   if(sum<=c&&i+j>count)
       count=i+j;
}

            System.out.println(count);


}

        }
    }


