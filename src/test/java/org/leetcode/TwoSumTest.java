package org.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.leetcode.TwoSum;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        int[] arr = new int[]{2,7,9,11};
        int[] ret = TwoSum.twoSum(arr,9);
        for(int i:ret) {
            System.out.println(i);
        }
        assertArrayEquals(new int[]{0,1},ret);


    }

}