package com.ALGOLUTION.SET3;

public class CoinProblem {
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sum = 4;
        System.out.println(coinSum(coins, coins.length, sum));
    }
    static int coinSum(int[] coins, int n, int sum){
        if(sum == 0){
            return 1;
        }
        if(n == 0 || sum < 0){
            return 0;
        }
        // take
        int left = coinSum(coins, n, sum - coins[n-1]);

        // not take
        int right = coinSum(coins, n-1, sum);

        return left + right;
    }
}
