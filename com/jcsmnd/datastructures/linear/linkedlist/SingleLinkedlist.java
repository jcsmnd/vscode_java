//written by Myungsik Kim
//singly linkedlist - head only with insert, delete by either value or index, and print
package com.jcsmnd.datastructures.linear.linkedlist;

class SingleLinkedlist{

    static Node head;
    
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
        newNode.next = null;

        if(head == null){
            head = newNode;
        }else{
            Node lastNode = head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    static void deleteByValue(Object data){
        
        Node currNode = head;
        Node prevNode = null;

        if(currNode != null && currNode.data == data){
            head = currNode.next;
            System.out.println(data+" value delete");
            return;
        }

        while(currNode != null && currNode.data != data){
            prevNode = currNode;
            currNode = currNode.next;
        }

        if(currNode != null){
            prevNode.next = currNode.next;
            System.out.println(data+" value delete");
        }

        if(currNode == null){
            System.out.println(data+" not found");
            return;
        }
    }


    static void deleteByIndex(int index){
        Node currNode = head;
        Node prevNode = null;
        int counter = 0;

        if(index == 0 && currNode != null){
            head = currNode.next;
            System.out.println(index+" index delete");
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
    }

    static void print(SingleLinkedlist list){
        Node currNode = list.head;

        while(currNode != null){
            System.out.println(currNode.data+" ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args){

        SingleLinkedlist list = new SingleLinkedlist();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
     

        print(list);
        System.out.println("---------");
        deleteByValue(3);
        System.out.println("---------");
        print(list);

        System.out.println("---------");
        deleteByValue(1);
        System.out.println("---------");
        print(list);
        
        System.out.println("---------");
        deleteByIndex(0);
        System.out.println("---------");
        print(list);

        System.out.println("---------");
        deleteByValue(4);
        System.out.println("---------");
        print(list);

    }
}