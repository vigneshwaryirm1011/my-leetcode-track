class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int current =1;
        int best = 1;
        for (int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                current = current + 1;
                if(current>best){
                best = current;
                }
            }else{
                current = 1;
            }
        }
        return best;
    }
}
