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

    static void append(Object data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = new Node(data);
    }

    static void prepend(Object data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    static void deleteByValue(Object data){
        
        Node currNode = head;
        Node prevNode = null;

        if(head == null){
            return;
        }

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

        append(1);
        append(2);
        append(3);
        append(4);
        prepend(5);
     

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