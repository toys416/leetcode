package org.leetcode;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0;i<len ;i++){
            int another = target - nums[i];
            if(map.containsKey(another)){
                return new int[] {map.get(another),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}