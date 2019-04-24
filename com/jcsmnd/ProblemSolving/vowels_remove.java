package com.jcsmnd.problemsolving;

class vowels_remove {
    
    public static void main(String[] args){
   
        String string = "A really COOL string";
        string = string.replaceAll("[aeiou]", "");
        System.out.println(string);

    }
}