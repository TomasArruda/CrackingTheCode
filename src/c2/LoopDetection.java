package c2;

import java.util.HashSet;

public class LoopDetection {
    public static Node<Integer> loopDetection(Node<Integer> node){
        HashSet<Node<Integer>> hash = new HashSet<>();

        if(node == null) {
            return null;
        }

        while(node != null) {
            if (hash.contains(node)){
                return node;
            }else{
                hash.add(node);
                node = node.next;
            }
        }

        return null;
    }

    public static void main(String args[]){
        Node<Integer> listNode1 = new Node<>(1);
        Node<Integer> listNode2 = new Node<>(2);
        Node<Integer> listNode3 = new Node<>(3);
        Node<Integer> listNode6 = new Node<>(6);
        Node<Integer> listNode7 = new Node<>(7);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode6;

        System.out.print('\n');
        Node<Integer> result = loopDetection(listNode1);

        System.out.print(result.value);
    }
}
