//How To Reverse And Add A Number Until You Get A Palindrome?

package com.jcsmnd.problemsolving;

class reverse_number_palindrome {

    int reversDigits(int num) 
    { 
        int rev_num = 0; 
        while (num > 0) 
        { 
            rev_num = rev_num*10 + num%10; 
            num = num/10; 
        } 
        return rev_num; 
    } 

    boolean isPalindrome(int num) 
    { 
        return (reversDigits(num) == num); 
    } 

    void ReverseandAdd(int num) 
    { 
        int rev_num = 0; 
        while (num <= 10000000){ 
            rev_num = reversDigits(num); 
            num = num + rev_num; 
 
            if(isPalindrome(num)) 
            { 
                System.out.println(num); 
                break; 
            } 
            else if (num > 10000000) 
            { 
                System.out.println("No palindrome exist"); 
            } 
        }  
    }
    
    public static void main(String[] args){
        reverse_number_palindrome ob = new reverse_number_palindrome(); 
        ob.ReverseandAdd(196);

    }
}