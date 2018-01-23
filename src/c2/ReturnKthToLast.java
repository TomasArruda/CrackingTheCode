package c2;

public class ReturnKthToLast {
    public static int returnKthToLast(Node<Integer> node, int pos){
        if(node == null) {
            return 0;
        }

        int index = returnKthToLast(node.next, pos) + 1;

        if (index == pos){
            System.out.println(node.value);
        }

        return index;
    }

    public static void main(String args[]){
        Node<Integer> listNode1 = new Node<>(1);

        listNode1.appendToTail(2);
        listNode1.appendToTail(3);
        listNode1.appendToTail(4);
        listNode1.appendToTail(5);
        listNode1.appendToTail(6);

        listNode1.printList();
        System.out.print('\n');

        returnKthToLast(listNode1, 2);
    }
}
