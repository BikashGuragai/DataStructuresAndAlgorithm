package com.guragai.DataTypes;
import java.util.NoSuchElementException;

public class LinkedListBasic {
    class Node{
        public Object data;
        public Node next;
    }

    private Node first;

    public LinkedListBasic(){
        first = null;
    }

    public Object getFirst(){
        if(first == null){
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public Object removeFirst(){
        if(first == null){
            throw new NoSuchElementException();
        }
        Object element = first.data;
        first = first.next;
        return element;
    }

    public void addFirst(Object element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
    }

    public boolean checkData(){
        return first.equals(null);
    }

    public void removeAll(){
        first = null;
    }


    public void printAll(){
        Node temp = first;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListBasic x = new LinkedListBasic();
        x.addFirst("A");
        x.addFirst("B");
        x.addFirst("C");
        x.addFirst("D");
        x.addFirst("E");
        x.removeFirst();
        x.printAll();
    }

}
