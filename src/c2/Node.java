package c2;

public class Node<T> {
    public Node<T> next;
    public T value;

    public Node(T value){
        this.value = value;
    }

    public void appendToTail(T value){
        Node<T> newNode = new Node<T>(value);
        Node<T> head = this;

        while(head.next != null){
            head = head.next;
        }

        head.next = newNode;
    }

    public void printList(){
        Node<T> node = this;
        while(node != null){
            System.out.print(node.value);
            node = node.next;
        }
    }

    public Node<T> deleteNode(Node head, T value){
        if(head.value == value){
            return head.next;
        }

        while(head.next != null){
            if(head.next.value == value){
                head.next = head.next.next;
                return head;
            }
            head = head.next;
        }

        return head;
    }
}
