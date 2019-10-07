//written by jcsmnd.com 04/26/2019 
//singly linkedlist - head only with insert new node(first, middle, last), delete node(first, middle, last) with value or index, and print list

package com.jcsmnd.datastructures.linear.linkedlist;

class SingleLinkedlist {
    
    Node head;

    class Node{
        Object data;
        Node next;

        Node(Object data){
            this.data = data;
            this.next = null;
        }
    }

    //insert head
    void addFirst(Object data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //insert middle with index
    void addMiddle(Object data, int index){
        if(index == 0){
            addFirst(data);
        }else{
            if(head == null || index < 0){
                System.out.println(index+" index not found");
                return;
            }
            Node currentNode = head;   
            for(int i=0; i<index-1; i++){
                    currentNode = currentNode.next;
                    if(currentNode == null){
                        System.out.println(index+" index not found");
                        return;
                    }
            }
            Node temp1 = currentNode;
            Node temp2 = temp1.next;
            Node newNode = new Node(data);
            temp1.next = newNode;
            newNode.next = temp2;
        }
    }

    //insert end of list
    void addLast(Object data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data);
    }

    //delete head
    void deleteFirst(){
        if(head == null){
            return;
        }
        Node currentNode = head;
        head = currentNode.next;
        System.out.println("first node "+currentNode.data+" deleted");
    }

    //delete by value
    void deleteMiddleByValue(Object data){
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
            System.out.println("value "+data+" deleted"); 
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            if(currentNode.next.data == data){
                currentNode.next = currentNode.next.next;
                System.out.println("value "+data+" deleted");  
                return;
            }
            currentNode = currentNode.next;
        }
        System.out.println("value "+data+" not found"); 
    }

    //delete by index
    void deleteMiddleByIndex(int index){     
        if(head == null){
            return;
        }
        Node currentNode = head;
        Node previousNode = null;
        if(index == 0){    
            head = currentNode.next;
            System.out.println("first index "+index+" deleted");
        }else{
            if(head == null || index < 0){
                System.out.println(index+" index not found");
                return;
            }    
            for(int i=0; i<index; i++){
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                    if(currentNode == null){
                        System.out.println(index+" index not found");
                        return;
                    }
            }
            if(previousNode == null){
                head = previousNode;
                System.out.println("index "+index+" node deleted");  
            }else{
                previousNode.next = currentNode.next;
                currentNode.next = null;
                System.out.println("index "+index+" node deleted");   
            }
        }
    }

    //delete end of list
    void deleteLast(){
        Node currentNode = head;
        Node previousNode = null;
        if(head == null){
            return;
        }
        while(currentNode.next != null){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if(previousNode == null){
            head = previousNode;
            System.out.println("last node "+currentNode.data+" deleted");  
        }else{
            previousNode.next = currentNode.next;
            currentNode.next = null;
            System.out.println("last node "+currentNode.data+" deleted");   
        }
    }

    //printout
    public String toString() {
        if(head == null){
            return "list is empty";
        }       
        Node temp = head;
        String str = "";
        while(temp.next != null){
            str += temp.data + "->";
            temp = temp.next;
        }
        str += temp.data;
        return str+"->null";
    }

    public static void main(String[] args) {
        SingleLinkedlist list = new SingleLinkedlist();
        list.addMiddle(0, 0); //[0->null]
        System.out.println(list);
        list.addMiddle(1, 1); //[0->1->null]
        System.out.println(list);
        list.addMiddle(2, 2); //[0->1->2->null]
        System.out.println(list);
        list.addMiddle(3, 1); //[0->3->1->2->null]
        System.out.println(list);
        list.addMiddle(3, 5); //error. index 3 is not exist
        System.out.println(list);
        list.addMiddle(3, -5); //error. negative index impossible
        System.out.println(list);
        list.addFirst(4); //[4->0->3->1->2->null]
        System.out.println(list);
        list.addFirst(5); //[5->4->0->3->1->2->null]
        System.out.println(list);
        list.addLast(6); //[5->4->0->3->1->2->6->null]
        System.out.println(list);
        list.addLast(7); //[5->4->0->3->1->2->6->7->null]
        System.out.println(list);
        list.addMiddle(8,8); //[5->4->0->3->1->2->6->7->8->null]
        System.out.println(list);
        list.deleteFirst(); //[5->4->0->3->1->2->6->7->8->null] -> remove 5
        System.out.println(list);
        list.deleteLast();  //[4->0->3->1->2->6->7->8->null] -> remove 8
        System.out.println(list);
        list.deleteLast();  //[4->0->3->1->2->6->7->null] -> remove 7
        System.out.println(list);
        list.deleteFirst(); //[4->0->3->1->2->6->null] -> remove 4
        System.out.println(list);
        list.deleteLast();  //[0->3->1->2->6->null] -> remove 6
        System.out.println(list);
        list.deleteMiddleByValue(2); //[0->3->1->2->null] -> remove 2
        System.out.println(list);
        list.deleteMiddleByIndex(2);  //[0->3->1->null] -> remove 1
        System.out.println(list);
        list.deleteFirst(); //[0->3->null] -> remove 0
        System.out.println(list);
        list.deleteLast();  //[3->null] -> remove 3
        System.out.println(list); //list is empty now
        list.deleteLast();  //list is already empty 
        System.out.println(list);
        list.deleteMiddleByValue(5);  //list is already empty
        System.out.println(list);
        list.deleteMiddleByIndex(0);  //list is already empty
        System.out.println(list);
        list.addMiddle(1, 1); //you can't add because it's an empty list and need to start 0 index
        System.out.println(list);
    }
}