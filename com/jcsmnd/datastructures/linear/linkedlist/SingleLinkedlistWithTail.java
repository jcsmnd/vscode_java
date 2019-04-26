//written by Myungsik Kim
//singly linkedlist - head and tail with insert, delete by either value or index, and print
package com.jcsmnd.datastructures.linear.linkedlist;

class SingleLinkedlistWithTail{

    static Node head;
    static Node tail;
    static int nodeSize = 0;
    
    static class Node{
        Object data;
        Node next;

        Node(Object data){ 
            this.data = data;
            this.next = null;
        }
    }

    static void insert(Object data){
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

    static void deleteByValue(Object data){
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

    static void deleteByIndex(int index){
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

    static void print(SingleLinkedlistWithTail list){
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
        
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        print(list);
        deleteByValue(2);
        print(list);
        deleteByValue(1);
        print(list);
        deleteByValue(3);
        print(list);
        deleteByIndex(1);
        print(list);
        deleteByIndex(1);
        print(list);
        deleteByIndex(1);
        print(list);
        deleteByIndex(0);
        print(list);
    }
}