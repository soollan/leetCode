package com.leet;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, m);
        return;
    }
}
