package com.example.Infosys;

import java.util.*;

// Question: https://youtu.be/UiuOs2weOTY?list=PLmqx-lXJtuZqA8V8MjHg8dU5M0GDmAHHH

public class SwapMax {

    public static void swap(int[] arr, int index, int ele){
        int i=0;
        for(;i<arr.length;i++){
            if(arr[i]==ele){
                break;
            }
        }
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    public static int maxSwap(int[] arr){
        int[] A = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            A[i] = arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer, Integer> h = new HashMap<>();
        int l=0, r=arr.length-1;
        while(l<r){
            h.put(arr[l], arr[r]);
            h.put(arr[r], arr[l]);
            l++;
            r--;
        }
        int count = 0;
        for(int i=0;i<A.length;i+=2){
            int ele = A[i];
            if(A[i+1]!=h.get(ele)){
                swap(A, i+1, h.get(ele));
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,9,3,6};
        int ans = maxSwap(arr);
        System.out.println(ans);
    }
}
