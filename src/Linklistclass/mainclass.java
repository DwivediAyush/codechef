package Linklistclass;

import java.sql.SQLOutput;

public class mainclass {
    linklist head;
    linklist start;
    public void insert(int d)
    {
        linklist temp=new linklist(d);
        if(head==null)
        {
            head=temp;
            start=temp;
        }
        else
        {   temp.next=head;//begin
            //head.next=temp;//at the end
            head=temp;

        }
    }
    public void display()
    {
        if (start == null) {
            System.out.println("list is empty");
        }
        else {
            linklist temp=head;//at thr begin
            //linklist temp=start;//at the end;
            System.out.println(temp.data);

            while(temp.next!=null) {
                temp = temp.next;
                System.out.println(temp.data);

            }
        }

    }

    public static void main(String[] args) {
        mainclass obj=new mainclass();
        obj.display();
        obj.insert(14);
        obj.display();
        obj.insert(24);
        obj.display();

    }
}
