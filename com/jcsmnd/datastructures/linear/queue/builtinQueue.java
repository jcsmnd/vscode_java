//written by Myungsik Kim
//builtin queue

package com.jcsmnd.datastructures.linear.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class builtinQueue{
    public static void main(String[] args) {
        
        Queue<String> queue01 = new PriorityQueue<>();
        Queue<Integer> queue02 = new ArrayDeque<>();
        Queue<Float> queue03 = new LinkedList<>();

        queue01.add("c");
        queue01.add("b");
        queue01.add("a");
        System.out.println(queue01); //Min Heap insert a->b->c. sorted a(root)->c(left child)->b(right child)
        queue01.poll(); //a(root) is polled. b(root)->c(left child)
        System.out.println(queue01);
        queue01.remove();
        queue01.remove();
        //queue01.remove(); // exception occurs due to using remove() when it is empry space;

        queue02.offer(3);
        queue02.offer(2);
        queue02.offer(1);
        System.out.println(queue02);
        queue02.poll();
        queue02.poll();
        queue02.poll();
        queue02.poll(); // no exception occurs even though it's empty;

        System.out.println(queue02);

        queue03.add(1.1f);
        queue03.add(1.2f);
        queue03.add(1.3f);
        System.out.println(queue03);
        
        queue03.forEach((value)->{
            System.out.println(value);
        });

        while(!queue03.isEmpty()){
             System.out.println(queue03.poll()); 
        }

        System.out.println(queue03);

        queue03.offer(1.4f);
        queue03.offer(1.5f);
        System.out.println(queue03.peek()); //get head includes null.
        System.out.println(queue03.element());//get head if null occur exeception.
    }
}