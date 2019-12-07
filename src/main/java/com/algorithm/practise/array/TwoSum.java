package com.algorithm.practise.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和.
 * https://leetcode-cn.com/problems/two-sum/submissions/
 * @author lichangwei
 */
public class TwoSum {
    /**
     * Hash.
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> index = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            Integer mi;
            if((mi = index.get(tmp)) != null) {
                return new int[]{i, mi};
            } else {
                index.put(nums[i], i);
            }
        }
        return null;
    }

    /**
     * For.
     */
    public int[] twoSumFor(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (tmp == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
