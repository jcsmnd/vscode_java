//Armstrong Number

package com.jcsmnd.problemsolving;


class armstrong_number{ 

    public static void main(String[] args){

        int num = 153;
        int temp = num;
        int len = 0;
    
        while(temp != 0){  
            temp/=10;
            len+=1;
        }

        int temp2 = num;
        int arm = 0;
        int rem;

        while(temp2 != 0){
            int multi=1;
            rem = temp2%10;
            for(int i=1; i<=len; i++){
                multi*=rem;
            }
            arm+=multi;
            temp2/=10;
        }

        if(arm==num){
            System.out.println(num+" is armstrong number");
        }else{
            System.out.println(num+" is not armstrong number");
        }
    }  
}