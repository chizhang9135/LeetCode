public class Answer {
    public int[] twoSum(int[] nums, int target) {
        int numsLen = nums.length;
        int start = 0;
        int end = 1;
        
        if(nums[start] + nums[end] == target)
            return new int[]{start, end};
        if(nums[numsLen - 1] + nums[numsLen - 1 - 1] == target) 
            return new int[]{numsLen - 1, numsLen - 1 - 1};
        
        for (int i=0; i<numsLen; i++) {
            for (int j=i+1; j<numsLen; j++){
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        
        return new int[]{start, end};
    }
}