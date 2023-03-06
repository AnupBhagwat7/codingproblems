package com.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Nodes<D>{

    D value;
    Nodes nodes;

    public Nodes(D value) {
        this.value = value;
    }

    public D getValue() {
        return value;
    }

    public void setValue(D value) {
        this.value = value;
    }

    public Nodes getNodes() {
        return nodes;
    }

    public void setNodes(Nodes nodes) {
        this.nodes = nodes;
    }
}
public class LinkedListWithGenerics {

    public static void main(String[] args) {

        Nodes<Integer> head = new Nodes<>(10);
        Nodes<Integer> firstNode = createNode(20);
        Nodes<Integer> secNode = createNode(30);
        Nodes<Integer> thirdNode = createNode(40);

        head.setNodes(firstNode);
        firstNode.setNodes(secNode);
        secNode.setNodes(thirdNode);

        printNodes(head);

    }

    private static void printNodes(Nodes<Integer> head) {

        while(head.getNodes() != null){
            System.out.println(head.getValue());
            head = head.getNodes();
        }
        System.out.println(head.getValue());
    }

    private static Nodes<Integer> createNode(int i) {

        return new Nodes<Integer>(i);
    }
}
