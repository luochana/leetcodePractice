package twoPointers.MergeSortedArray_88;

public class solution_java {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right = m + n - 1;
        while(m > 0 && n > 0){
            if(nums1[m - 1] > nums2[n - 1]){
                nums1[right--] = nums1[m - 1];
                m--;
            }else{
                nums1[right--] = nums2[n - 1];
                n--;
            }
        }
        if(n > 0){
            for(; n > 0; n--){
                nums1[right--] = nums2[n - 1];
            }
        }
    }
}
