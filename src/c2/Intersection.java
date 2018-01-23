package c2;

public class Intersection {

    public static int length(Node<Integer> node){
        int result = 0;

        Node<Integer> head = node;

        while(head != null) {
            result++;
            head = head.next;
        }

        return result;
    }

    public static boolean thereIsIntersection(Node<Integer> node1, Node<Integer> node2){
        return lastNode(node1) == lastNode(node2);
    }

    public static Node<Integer> lastNode(Node<Integer> node){
        Node<Integer> head = node;

        while(head.next != null) {
            head = head.next;
        }

        return head;
    }

    public static Node<Integer> moveHead(Node<Integer> node, int pos){
        int i = 0;
        while(i < pos){
            node = node.next;
            i++;
        }
        return node;
    }

    public static Node<Integer> getIntersectNode(Node<Integer> node1, Node<Integer> node2){
        Node<Integer> head1 = node1;
        Node<Integer> head2 = node2;

        while(head1 != null || head2 != null){
            if(head1 == head2){
                return head1;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }

    public static Node<Integer> intersect(Node<Integer> node1, Node<Integer> node2){
        if (thereIsIntersection(node1, node2)){
            int len1 = length(node1);
            int len2 = length(node2);

            if(len1 - len2 > 0){
                node1 = moveHead(node1, len1 - len2);
            }else if (len2 - len1 > 0){
                node2 = moveHead(node2, len2 - len1);
            }

            return getIntersectNode( node1, node2);
        }

        return new Node<>(15);
    }

    public static void main(String args[]){
        Node<Integer> listNode1 = new Node<>(1);
        Node<Integer> listNode2 = new Node<>(2);
        Node<Integer> listNode3 = new Node<>(3);

        Node<Integer> listNode6 = new Node<>(6);
        Node<Integer> listNode7 = new Node<>(7);

        Node<Integer> listNodei = new Node<>(0);
        Node<Integer> listNodei2 = new Node<>(9);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNodei;

        listNode6.next = listNode7;
        listNode7.next = listNodei;
        listNodei.next = listNodei2;


        listNode1.printList();
        System.out.print('\n');
        System.out.println(length(listNode1));
        listNode6.printList();
        System.out.print('\n');
        System.out.println(length(listNode6));

        Node<Integer> result = intersect(listNode1, listNode6);

        if (result != null) result.printList();
    }
}
