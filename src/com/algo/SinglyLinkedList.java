package com.algo;

/**
 * Created by Binal on 4/26/17.
 */
public class SinglyLinkedList<T> {
    private Node<T> head;

    public void add(T element){
        Node node = new Node();
        node.setValue(element);
        System.out.println("Adding value :"+element);
        Node temp = head;
        while(true){
            if(temp == null){
                head = node;
                break;
            } else if(temp.getNextRef()==null){
                temp.setNextRef(node);
                break;
            } else {
                temp = temp.getNextRef();
            }
        }
    }

    public void traverse(){
        Node node = head;
        while(true){
            if(node == null){
                break;
            }
            System.out.print(node.getValue() +"\t");
            node = node.getNextRef();
        }
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current!= null){
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String args[]){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(3);
        list.add(32);
        list.add(54);
        list.add(89);
        System.out.println();
        list.traverse();
        System.out.println();
        list.reverse();
        list.traverse();
    }

}

class Node<T> implements Comparable<T>{

    private T value;
    private Node<T> nextRef;

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public Node<T> getNextRef(){
        return nextRef;
    }

    public void setNextRef(Node nextRef){
        this.nextRef = nextRef;
    }
    @Override
    public int compareTo(T o) {
        if(o == this.value){
            return 0;
        } else {
            return 1;
        }
    }
}
