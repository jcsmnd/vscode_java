package com.mkim.exercise;
import java.util.ArrayList;
import java.util.List;

class E02 {
    public static void main(String[] args){
        //System.out.println("1+1="+1+1);
        //System.out.println("1+1="+(1+1));
        //method01();  

        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {20,8,15}};

        int temp1, temp2;
        int result = 0;
               
        int sum1=0;
        int sum2=0;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr.length; col++){
                if(row==col){
                   sum1 = sum1 + arr[row][col];
                }
            }
        }

        System.out.println(sum1);

        
    }

    public static void method01(){
        int a = 10;
        int c = 0;
        int d = 0;
        int b[] = new int[2];

        b[0] = 1;
        b[1] = 2;
        b[2] = 3;

        System.out.println(b[0]++);
        System.out.println(b[0]);
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
        List<Integer> intList = new ArrayList<>();
        
        int alice = 0;
        int bob =0;

        for(int i=0; i<a.size(); i++){
            if(a.get(i) > b.get(i)){
                intList.add(0, alice++);
            }else if(a.get(i) < b.get(i)){
                intList.add(1, bob++);
            }   
        }
        return intList;
    }

    static long aVeryBigSum(long[] ar) {
        long result = 0l;
        for(int i = 0; i < ar.length; i++){
            result = result + ar[i]; 
        }

        return result;
    }

    static int diagonalDifference(int[][] arr) {
        int temp1, temp2;
        int result = 0;

        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length; j++){
                temp1 = arr[i][j] + arr[i+1][j+1] + arr[i+2][j+2];
                temp2 = arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j];
                result = temp1 - temp2;
            }
        }
        return result;
    }


    public static void reverseString(char[] s) {
        //s.to
        //byte[] result = new byte[convert.length];
    }
}