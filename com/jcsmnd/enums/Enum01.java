//Written by Myungsik Kim
package com.jcsmnd.enums;

class Enum01{

    enum Food{
        apple, banana, yogurt, beef
    }

    enum Human{
        male(10), female(20);
        int age;
        private Human(int age){
            System.out.println("enum constructor called");
            this.age = age;
        }

        public String toString(){
            return age + "years old";
        }
    }
    public static void main(String[] args){
        Food apple = Food.apple;
        Human human = Human.male;
        System.out.println(apple);
        System.out.println(human);
    }
}