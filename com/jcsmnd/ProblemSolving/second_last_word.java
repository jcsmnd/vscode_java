//Searching for the second last word in a string

package com.jcsmnd.problemsolving;

class second_last_word {
    
    public static void main(String[] args){
        String a = "aaa bbb ccc ddd eee fff ggg";
        String[] result = a.split(" ");
        System.out.println(result[result.length-2]);
    }
}