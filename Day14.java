public class Day14 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head =null;
    void insertAtBegin(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    void printList(){
        Node current = head;
        while(current !=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
            Day14 list = new Day14();
            list.insertAtEnd(1);
            list.insertAtEnd(2);
            list.insertAtEnd(3);
            list.printList();
    }
}
