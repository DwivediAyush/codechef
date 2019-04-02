package Linklistclass;


public class mainclass {
   private linklist last;
    private linklist start;

    public void insert(int d)
    {
        linklist temp=new linklist(d);
        if(last==null)
        {
            last=temp;
            start=temp;
        }
        else
        {   //temp.next=last;//begin
            last.next=temp;//at the end
            last=temp;

        }
    }
   public void reverse(linklist temp ) {
       if (temp == null) return;
       //System.out.print(temp.data + " ");
       reverse(temp.next);
        System.out.print(temp.data + " ");

   }
    public void display()
    {
        if (start == null) {
            System.out.println("list is empty");
        }
        else {
          //  linklist temp=last;//at thr begin
            linklist temp=start;//at the end;
            System.out.println(temp.data);

            while(temp.next!=null)
            {
                temp = temp.next;
                System.out.println(temp.data);

            }
        }

    }

    public static void main(String[] args) {
        mainclass obj=new mainclass();
       // obj.display();
        obj.insert(14);
        //obj.display();
        obj.insert(24);
        //obj.display();
 obj.reverse(obj.start);
    }
}
