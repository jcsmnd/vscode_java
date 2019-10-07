//Written by Myungsik Kim
//Bubble sort implementation. 04/25/2019

package com.jcsmnd.datastructures.sort;

class Bubble{
    public static void main(String args[]){
        int temp;
        int[] array = {5,8,6,10,9,1,4,3,7,2};

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < (array.length-1)-i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}