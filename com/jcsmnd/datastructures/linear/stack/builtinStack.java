//written by Myungsik Kim
//builtin stack

package com.jcsmnd.datastructures.linear.stack;

import java.util.Stack;

class builtinStack{
    public static void main(String[] args) {
        
        Stack<String> stack01 = new Stack<>();

        stack01.push("a");
        stack01.push("b");
        stack01.push("c");

        System.out.println(stack01);

        stack01.pop();

        System.out.println(stack01);
        
        System.out.println(stack01.search("b")); 
        System.out.println(stack01.capacity()); 
    }
}