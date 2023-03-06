//Find midle element of linked list
package com.datastructures;

class Node<D>{
    D data;
    Node next;

    public Node(D data, Node<D> node) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedListDemo {

    Node node;

    public static void main(String[] args) {
        Node head = new Node(0, null);
        Node n1 = new Node(1, null);
        Node n2 = new Node(2, null);
        Node n3 = new Node(3, null);
        Node n4 = new Node(4, null);
        Node n5 = new Node(5, null);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        LinkedListDemo linkedListDemo=new LinkedListDemo();
        linkedListDemo.node = head;

        Node currentNode =linkedListDemo.node;

        while(currentNode.next != null){

            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

        linkedListDemo.findMiddleElement();
    }

    private void findMiddleElement() {

        Node currentNode = this.node;

        Node slow = currentNode.next;
        Node fast = currentNode.next.next;

        while(slow.next != null && fast.next !=null){

            slow = currentNode.next;
            fast = currentNode.next.next;
            //currentNode = j
        }

    }


}
