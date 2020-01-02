package com.test;

public class LinkedList {
    Node head;
    Node current;

    public void add(Integer data) {
       Node node=  new Node(data);
        if (head == null){
            head =  node;
        }
        else{
            current.next = node;  // Here current means previous one
        }
        current =  node;  //Assigning to the current node
    }

    public void traverse(){
        Node currentNode = head;
               while(currentNode != null){
                    System.out.println(currentNode.data);
                   currentNode = currentNode.next;
               }
    }

    public void insertAtBeginning(Integer data ){
        Node temp = head;
       Node newHeadNode = new Node(data);
        head =   newHeadNode;
        head.next = temp;
    }
    public void insertAtEnding(Integer data ){
        Node newLastNode = new Node(data);
        newLastNode.next = null;
        Node current = head;
        while(current != null && current.next != null){
            current = current.next;
        }
        Node lastNode =  current;
        lastNode.next =  newLastNode;
    }

    public void insertAtMiddle(Integer data, int position ){
        Node currentNode = head;
        int index = 0;
        while(currentNode != null && index < position){
            currentNode = currentNode.next;
            index++;
        }
        Node newNodePrev = currentNode;
        Node newNodeNext =  newNodePrev.next;
        Node newNode = new Node(data);
        newNodePrev.next = newNode;
        newNode.next =  newNodeNext;
    }

    public void deleteHead( ){
        Node temp = head;
        head = temp.next;
    }

    public void deleteLastNode( ){
        Node current = head;
        Node currentPrev = null;
        while(current != null && current.next != null){
            currentPrev = current;
            current = current.next;
        }
        currentPrev.next = null;
    }

    public void deleteNodeAtPosition(int position ){
        Node current = head;
        int index = 0;
       while(current != null && index < position ){
          current = current.next;
          index++;
       }
        Node prevOfNodeToDelete =  current;
       System.out.println("data:"+prevOfNodeToDelete.data);
        Node nextOfNodeToDelete = (prevOfNodeToDelete.next == null)? null :    prevOfNodeToDelete.next.next;
        prevOfNodeToDelete.next = nextOfNodeToDelete;
    }
}
class Node{
    Integer data;
    Node next;
    public Node(Integer data){
        this.data = data;
    }
}