class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int i = 1;
        for (int j = 1; j< nums.length; j++){
            if (nums[j] == nums[i-1] && count != 0){
                nums[i] = nums[j];
                i++;
                count--;
                continue;
            } else if (nums[j] != nums[i-1] ){
                nums[i] = nums[j];
                i++;
                count = 1;
            }
        }
        return i;
    }
}