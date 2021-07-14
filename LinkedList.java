package DS.com;
public class LinkedList{
    public Node head;//instance variable creating the head
    public static class Node//creating the node class
    {
        int data;//creating the data
        Node next;//creating the next variable of the node
        public Node(int data)//creating the
        {
            this.data=data;//initializing the class variable using the this method
            this.next=null;//initializing the next variable of the node
        }
    }
    public void insertBeigining(int value)
    {
        Node n5=new Node(value);//creating the new node
        n5.next=head;
        head=n5;
    }
    public void display()//displaying the data of the linked list
    {
        Node temp=head;//taking a temporary variable temp
        while(temp!= null)//applying the condition
        {
            System.out.print(temp.data);
            System.out.print("\t");
            temp=temp.next;
        }
        System.out.println();

    }
    public int length()
    {
        int count=0;
        if(head==null)
        {
            return 0;
        }else
        {
            Node current=head;
            while(current!=null)
            {
                count++;
                current=current.next;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       LinkedList li=new LinkedList();
       li.head=new Node(10);//creating the fiirst node
        Node n1=new Node(20);//creating the second node
       Node n2=new Node(30);// creating the third node
       Node n3=new Node(40);//creating the fourth node
       li.head.next=n1;
       n1.next=n2;
       n2.next=n3;
       System.out.println("Linked before inserting the elements");
       li.display();
        System.out.println("Linked after inserting the elements");
       li.insertBeigining(5);
       li.display();
//        System.out.println("The length is:"+li.length());

    }
}
