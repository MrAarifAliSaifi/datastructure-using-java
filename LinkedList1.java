package DS.com;
public class LinkedList1{
    public Node start;
    public static class Node{
        int data;
        Node next;
        public Node(int value)
        {
            this.data=value;
            this.next=null;
        }
    }
    void diplay()
    {
        Node temp=start;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList1 li=new LinkedList1();
       li.start= new Node(12);
       li.diplay();

    }
}
