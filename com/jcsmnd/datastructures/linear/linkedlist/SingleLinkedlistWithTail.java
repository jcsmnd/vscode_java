//written by Myungsik Kim
//singly linkedlist - head and tail with insert, delete by either value or index, and print
package com.jcsmnd.datastructures.linear.linkedlist;

class SingleLinkedlistWithTail{

    Node head;
    Node tail;
    int nodeSize = 0;
    
    class Node{
        Object data;
        Node next;

        Node(Object data){ 
            this.data = data;
            this.next = null;
        }
    }

    void insertFirst(Object data){
        
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;  
        nodeSize++;
        
        if(head.next == null){
            tail = head;
        }
    }

    void insertLast(Object data){
        
        Node newNode = new Node(data);
        
        if(nodeSize == 0){ 
            newNode.next = head;
            head = newNode;
            tail = head;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        
        nodeSize++;
    }

    void deleteByValue(Object data){ //if duplicates, delete first element left to right.
        Node currNode = head;
        Node prevNode = null;
        if(currNode != null && currNode.data == data){
            head = currNode.next;
            System.out.println(data+" delete");
            nodeSize--;
            return;
        }
        while(currNode != null && currNode.data != data){
            prevNode = currNode;
            currNode = currNode.next;
        }
        if(currNode != null){
            prevNode.next = currNode.next;
            System.out.println(data+" delete");
        }
        if(currNode == null){
            System.out.println(data+" not found");
            return;
        }
        if(currNode != null && currNode.data == tail.data){
            tail = prevNode;
        }
        nodeSize--;
    }

    void deleteByIndex(int index){
        Node currNode = head;
        Node prevNode = null;
        int counter = 0;
        if(index == 0 && currNode != null){
            head = currNode.next;
            System.out.println(index+" index delete");
            nodeSize--;
            return;
        }
        while(currNode != null){
            if(counter == index){
                prevNode.next = currNode.next;
                System.out.println(index+" index delete");
                break;
            }else{
                prevNode = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if(currNode == null){
            System.out.println(index+" index not found");
            return;
        }
        if(currNode != null && currNode.data == tail.data){
            tail = prevNode;
        }
        nodeSize--;
    }

    void print(SingleLinkedlistWithTail list){
        Node currNode = head;
        System.out.println("-----list start-----");
        while(currNode != null){
            System.out.println(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println("-----list end-----");
        System.out.println("node size:"+nodeSize);     
        if(head != null && tail != null){
            System.out.println("your head node is:"+head.data);
            System.out.println("your tail node is:"+tail.data);
        }
    }

    public static void main(String[] args){

        SingleLinkedlistWithTail list = new SingleLinkedlistWithTail();
        
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertFirst(0);
        list.insertFirst(7);
        list.print(list);
        list.deleteByValue(2);
        list.print(list);
        list.deleteByValue(1);
        list.print(list);
        list.deleteByIndex(2);
        list.print(list);
        list.deleteByIndex(0);
        list.print(list);
        list.deleteByIndex(1);
        list.print(list);
    }
}