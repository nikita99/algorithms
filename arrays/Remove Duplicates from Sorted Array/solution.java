class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int i = 0, j = 1;
        while(j<nums.length){
           if(nums[i] == nums[j]){
               while(j<nums.length && nums[i] == nums[j]){
                    j++;
                }
                if(j<nums.length){
                    i++;
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                } 
           }else{
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;            
           }
           j++;
        }
        return i+1;
    }
}
