package com.example.Infosys;

import java.util.ArrayList;
import java.util.List;

public class TargetSumCombination {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> A = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        targetSum(candidates, 0, target, l, A);
        return A;
    }

    public static void targetSum(int[] candidates, int i, int target, List<Integer> l, List<List<Integer>> A){
        if(i==candidates.length){
            if(0 == target){
                A.add(new ArrayList(l));
            }
            return;
        }
        if(candidates[i]<=target){
            l.add(candidates[i]);
            targetSum(candidates, i, target-candidates[i], l, A);
            l.remove(l.size()-1);
        }
        targetSum(candidates, i+1, target, l, A);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> l = combinationSum(arr, target);
        System.out.println(l);
    }

}

