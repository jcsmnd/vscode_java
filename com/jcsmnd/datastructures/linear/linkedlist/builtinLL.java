//written by Myungsik Kim
//using linkedlist built in java util

package com.jcsmnd.datastructures.linear.linkedlist;

import java.util.LinkedList;

class builtinLL{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        System.out.println(list);
        list.addFirst(0);
        System.out.println(list);
        list.addLast(6);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.set(1,11));
        System.out.println(list.getLast()); 
    }
}