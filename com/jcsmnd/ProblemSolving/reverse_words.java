//Reverse words in a given String

package com.jcsmnd.problemsolving;

class reverser_words {

    public static void main(String[] args){

        String input ="hi my name is jack";
        String result  = "";
        
        String[] temp = input.split(" ");

        for(int i=0; i<temp.length; i++){
            if(i == temp.length-1){
                result = temp[i] + result;
            }else{
                result = " "+ temp[i] + result; 
            }
        }
        System.out.println(result);
    }
}