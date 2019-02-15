package hackerrank;

import java.util.*;

    public class dsa105 {
        int[] list;
        int no;
        dsa105(int[] list, int no)
        {
            this.list=list;
            this.no=no;
        }
        public boolean search(int e)
        {   boolean r=false;
            for(int i=0;i<=no;i++)
                if(list[i]==e)
                    r=true;
            return r;
        }
        public void insert(int e)
        {
            if(no<list.length-1)
            {
                no++;
                list[no]=e;
            }
            else
                System.out.println("list is full");

        }

        void display()
        {
            for(int i=0;i<=no;i++)
            {  System.out.print(list[i]);
                if(i<no)
                    System.out.print(",");
            }
        }

        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int[] l=new int[n];
            dsa105 obj=new dsa105(l,-1);
            int flag=0;
            while(true)
            {  flag++;
                int e=s.nextInt();
                if(!obj.search(e))
                {
                    obj.insert(e);
                    System.out.println("Dairy Milk");

                }
                if(obj.no==n-1)
                {    System.out.println("list is full");
                    break;
                }
            }
            // obj.sort();
            obj.display();
            System.out.println();
            System.out.println(flag);

        }
    }

