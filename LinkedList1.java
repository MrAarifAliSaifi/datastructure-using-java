package DS.com;
import java.util.Scanner;
public class LinkedList1 {
    public Node start;
    public static class Node {
        String data;
        Node next;

        public Node(String value) {
            this.data = value;
            this.next = null;
        }
    }
    public void insertAtLast(String value) {
        Node n1 = new Node(value);
        if (start == null) {
            start = n1;
            return;
        } else {
            Node current = start;
            while (current != null) {
                current = current.next;
            }
            current.next=n1;

        }
    }
        void diplay()
        {
            Node temp = start;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        public static void main (String[]args){
            LinkedList1 li = new LinkedList1();
            li.start = new Node("aarif");
           li.insertAtLast("billa");
            li.diplay();
        }
    }

