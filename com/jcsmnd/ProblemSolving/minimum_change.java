//Leetcode 322. Coin Change 

package com.jcsmnd.problemsolving;

class minimum_change {

    public static int coinChange(int[] coins, int amount) {
        
        if(amount < 1){
            return 0;
        }

        return coinChange(coins, new int[amount], amount);
    }
    
    private static int coinChange(int[] coins, int[] count, int amount) {
        
        int minimum = Integer.MAX_VALUE;
        
        if(amount<0){
            return -1;
        }

        if(amount==0){
            return 0;
        } 

        if(count[amount-1] != 0){
            return count[amount-1];
        }

        for(int coin : coins) {
            int result = coinChange(coins, count, amount - coin);
            if(result >= 0 && result < minimum)
            minimum = result + 1;
        }
        count[amount-1] = (minimum==Integer.MAX_VALUE) ? -1 : minimum;
        return count[amount-1];
    }

    public static void main(String[] args) {
        int coins[] = {1,2,3};
        int amount = 4;
        System.out.println("Minimum coins required is " + coinChange(coins, amount));
    }
}