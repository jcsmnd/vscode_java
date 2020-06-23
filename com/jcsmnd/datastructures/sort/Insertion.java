//Written by Myungsik Kim
//Insertion sort implementation. 04/25/2019

package com.jcsmnd.datastructures.sort;

class Insertion{
    public static void main(String args[]){
        int[] array = {5,8,6,10,9,1,4,3,7,2};

        for(int i=0; i<array.length-1; i++){
            int j = i;
            while(array[j] > array[j+1]){
               int temp = array[j];
               array[j] = array[j+1];
               array[j+1] = temp;
               
               if(j!=0){
                  j--;
               }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}