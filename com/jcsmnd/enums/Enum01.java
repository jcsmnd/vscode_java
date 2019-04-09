//Written by Myungsik Kim
package com.jcsmnd.enums;

class Enum01{

    enum Food{
        apple, banana, yogurt, beef
    }

    enum Human{
        male, female
    }
    public static void main(String[] args){
        Food apple = Food.apple;
        Human male = Human.male;
        System.out.println(apple);
        System.out.println(male);
    }
}