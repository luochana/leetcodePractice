package hot_100.PartitionEqualSubsetSum;

public class PartitionEqualSubsetSum_java {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum = sum / 2;
        boolean[] res = new boolean[sum + 1];
        res[0] = true;
        for (int num : nums) {
            for (int i = sum; i >= num; i--) {      //注意，一定要从后往前，因为一个值只能用一次。从前往后会产生重复
                res[i] = res[i] || res[i - num];
            }
        }

        return res[sum];
    }
}