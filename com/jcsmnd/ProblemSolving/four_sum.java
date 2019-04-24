//18. 4Sum. target is 0 
//bruteforce method n^4
package com.jcsmnd.problemsolving;

class four_sum {
    public static void main(String[] args){
    

        int a[] = {-5, 4, 2, 6, 0, 1, -1, -5};
        int target = 0;
        boolean result = false;

        for(int i=0; i<a.length-3; i++){
            for(int j=i+1; j<a.length-2; j++){
                for(int k=j+1; k<a.length-1; k++){
                    for(int l=k+1; l<a.length; l++){
                        if(a[i]+a[j]+a[k]+a[l] == target){
                            System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]);
                            result = true;
                        }
                    }
                }
            }
        }

        if(result == false){
            System.out.println("no zero sum possible");
        }
    }
}