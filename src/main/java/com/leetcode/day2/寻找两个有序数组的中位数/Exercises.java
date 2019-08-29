package com.leetcode.day2.寻找两个有序数组的中位数;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Exercises {
    public static void main(String[] args) {
        int c[]= new int[]{1,2};
        int d[] = new int[]{3,4};
        System.out.println(findMedianSortedArrays(c,d));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res;
        int a1=0,a2=0;
        int sum [] =new int[nums1.length+nums2.length];
        for (int i = 0; i < sum.length; i++) {
            if (a1 < nums1.length && a2 < nums2.length && nums1[a1] > nums2[a2]) {
                sum[i] = nums2[a2];
                a2++;
            } else {
                if(a1 == nums1.length){
                    sum[i] = nums2[a2];
                    a2++;
                }else {
                    sum[i] = nums1[a1];
                    a1++;
                }
            }
        }
        if(sum.length == 0){
            res = 0.0;
        } else if(sum.length == 1){
            res = sum[0];
        } else if(sum.length % 2 == 0){
            res = (sum[sum.length/2 -1]+sum[sum.length/2])/2.0;
        }else{
            res = sum[sum.length/2];
        }
        return res;
    }
}
