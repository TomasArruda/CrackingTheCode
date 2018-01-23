package c2;

public class RemoveDups {

    public static void removeDups(Node<String> node){
        Node<String> h1 = node;
        Node<String> h2 = null;

        while(h1 != null && h1.next != null) {
            h2 = h1;
            while (h2.next != null) {
                if (h1.value == h2.next.value) {
                    h2.next = h2.next.deleteNode(h2.next, h2.next.value);
                }

                h2 = h2.next;
            }

            h1 = h1.next;
        }
    }

    public static void main(String args[]){
        Node<String> listNode1 = new Node<>("a");

        listNode1.appendToTail("b");
        listNode1.appendToTail("c");
        listNode1.appendToTail("a");
        listNode1.appendToTail("b");
        listNode1.appendToTail("d");

        listNode1.printList();

        removeDups(listNode1);

        System.out.print('\n');

        listNode1.printList();
    }
}
