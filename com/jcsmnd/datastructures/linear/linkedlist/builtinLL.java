//written by Myungsik Kim
//using linkedlist built in java util

package com.jcsmnd.datastructures.linear.linkedlist;

import java.util.List;
import java.util.LinkedList; //doubly-linked and cicrular

class builtinLL{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(7);
        System.out.println(list);


        for(int a : list){
            System.out.print(a+" ");
        }
        System.out.println();

        list.addFirst(0);
        System.out.println(list);
        list.addLast(6);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.set(1,11));
        System.out.println(list.getLast()); 
    }
}