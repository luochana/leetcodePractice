package tencent.MergeSortedArray_88;

public class MergeSortedArray_java {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);
        int p=0;
        int q=0;
        int i=0;
        while (p<m && q<n){
            if(nums1_copy[p]<nums2[q]){
                nums1[i++]=nums1_copy[p++];
            }else if(nums1_copy[p]>nums2[q]){
                nums1[i++]=nums2[q++];
            }else{
                nums1[i++]=nums1_copy[p++];
                nums1[i++]=nums2[q++];
            }
        }
        while (p<m){
            nums1[i++]=nums1_copy[p++];
        }
        while (q<n){
            nums1[i++]=nums2[q++];
        }
    }
}
