package DS.com;
public class InsertAtGivenPositionInLinkedList{
    public Node start;
    public static class Node
    {
        int data;
        Node next;
        public Node(int value)
        {
            this.data=value;
            this.next=null;
        }
    }
    void display()
    {
        if(start==null){
            return ;
        }else{
            Node temp=start;
            while(temp!=null)
            {
                System.out.print(temp.data);
                temp=temp.next;
                System.out.print("\t");
            }
        }
    }
    void insert(int value,int position)
    {
        Node n4=new Node(25);
        if(position==1)
        {
            n4.next=start;
            start=n4;
        }else
        {
            Node previous=start;
            int count=1;
            while(count<position-1)
            {
                previous=previous.next;
                count++;
            }

            Node current=previous.next;
            previous.next=n4;
            n4.next=current;
        }
    }
    public static void main(String[] args) {
        InsertAtGivenPositionInLinkedList li=new InsertAtGivenPositionInLinkedList();
        li.start=new Node(123);
        Node n1=new Node(12);
        Node n2=new Node(13);
        Node n3=new Node(14);
        li.start.next=n1;
        n1.next=n2;
        n2.next=n3;
        System.out.println("before inserting!!");
        li.display();
        System.out.println("After inserting !!");
        li.insert(30,3);
        li.display();
    }
}
