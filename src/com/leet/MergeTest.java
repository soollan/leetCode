package com.leet;

import org.junit.jupiter.api.Test;

class MergeTest {

    @Test
    void merge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 6;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Merge merge = new Merge();
        merge.merge(nums1, m, nums2, n);
    }
}