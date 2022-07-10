package com.example.Infosys;

public class MaxContiSubArraySum {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, -2, 5};
        long ans = maxSubarraySum(arr, n);
        System.out.println(ans);
    }

    private static long maxSubarraySum(int[] arr, int n) {
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            if(max<sum){
                max = sum;
            }
            if(sum<=0){
                sum = 0;
            }
        }
        return max;
    }

}
