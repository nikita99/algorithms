/*
Runtime: 0ms, 100% faster
Memory:  56.4 MB
*/
class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, (k%nums.length)-1);
        reverse(nums, (k%nums.length), nums.length-1);
    }
    
    public void reverse(int[] a, int l, int r){
        int i = l, j = r;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    
}
