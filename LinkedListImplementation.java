package data_structure;
import java.util.LinkedList;
public class LinkedListImplementation {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtBeginening( int data) {
        Node n1 = new Node(data);
        n1.next = null;
        if (head == null) {
            head = n1;
        }else{
            n1.next=head;
            head=n1;
        }
    }
    public void insertAtLast( int data) {
        Node n1 = new Node(data);
        n1.next = null;
        if (head == null) {
            head = n1;
        } else {
            Node temp = head;
            while (temp!= null) {
                temp = temp.next;
            }
            temp.next=n1;
        }
    }
    public void insertAtposition( int data,int position){
        Node n1 = new Node(data);
        n1.next = null;
        if (position<0) {
            System.out.println("Please enter the valid position!!");
        }else if (position==0) {
            n1.next=head;
            head=n1;
        } else{
            Node current= head;
            Node forward;
            int count=0;
            while(count!=position-1) {
                current=current.next;
                count++;
            }
            forward=current.next;
            current.next=n1;
            n1.next=forward;
        }
    }
    public void deleteAtBeginening(){
        if (head == null){
            System.out.println("Under flow!!");
        }else{
            head=head.next;

        }
    }
    public void deleteAtEnd(){
        if(head == null){
            System.out.println("Under flow!!");
        }else{
            Node current=head;
            Node previous=null;
            while(current!=null)
            {
                previous=current;
                current=current.next;
            }
             previous.next=null;
        }
    }
    public void traversing(){
        Node temp = head;
        while (temp!= null) {

            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImplementation li = new LinkedListImplementation();
//
//        li.insertAtBeginening( 12);;
        li.insertAtBeginening(12);
        li.insertAtBeginening(12);
        li.insertAtBeginening(12);
        li.insertAtBeginening(17);
        li.insertAtBeginening(16);
        li.insertAtBeginening(15);
        li.insertAtBeginening(14);
        li.insertAtBeginening(12);
        li.insertAtBeginening(1);
//        li.deleteAtEnd();

//        li.deleteAtEnd();

//        li.insertAtBeginening( 12);
//        li.deleteAtBeginening();
         li.traversing();
    }
}
