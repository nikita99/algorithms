/*
Runtime: 2 ms
Memory Usage: 39.2 MB
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
       
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                map.put(nums2[i], map.get(nums2[i])-1);
                temp.add(nums2[i]);
                if(map.get(nums2[i]) == 0){
                    map.remove(nums2[i]);
                }
            }
            
        }
         int[] ans = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}
