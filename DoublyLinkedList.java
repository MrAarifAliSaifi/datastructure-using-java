package DS.com;
public class DoublyLinkedList {
    public static Node head;
    public Node tail;
    public int size;

    public static class Node {
        Node next;
        int data;
        Node pre;

        Node(int data){
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }
    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
//    public void insert(int val) {
//        Node n1 = new Node(val);
//        if (head == null) {
//            head = n1;
//        } else {
//            tail.next = n1;
//            n1.pre = tail;
//            tail = n1;
//            size++;
//        }
//        }
        void display() {
            Node temp = head;
            if (head == null) {
                System.out.println("Linked list is empty");

            } else {
                while (temp != null) {
                    System.out.print(temp.data+"\t");
                    temp = temp.next;
                }
                System.out.println("null");

            }
        }
        void insertAtBeining(int value)//inserting the node at the beigining of the liked list
        {

            Node n3=new Node(value);
            n3.next=head;
            head.pre=n3;
            head=n3;
            size++;
        }

    public static void main(String[] args) {
        DoublyLinkedList li=new DoublyLinkedList();
        head=new Node(12);
        Node n1=new Node(13);
        Node n2=new Node(14);
         head.next=n1;
         n1.pre=head;
         n1.next=n2;
         li.insertAtBeining(15);
        li.display();
    }

    }



