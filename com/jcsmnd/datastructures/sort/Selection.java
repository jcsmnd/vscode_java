//Written by Myungsik Kim
//Selection sort implementation. 04/25/2019

package com.jcsmnd.datastructures.sort;

class Selection{

    public static void main(String args[]){
        int min, index = 0, temp;
        int[] array = {5,8,6,10,9,1,4,3,7,2};

        for(int i = 0; i < array.length; i++){
            min = 10;
            for(int j = i; j < array.length; j++){
                if(min > array[j]){
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        for(int i = 0; i < 10; i++){
            System.out.print(array[i]+" ");
        }
    }
}