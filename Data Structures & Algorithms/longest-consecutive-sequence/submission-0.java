class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for(int i = 0; i< nums.length; i++){
            if (!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        for (int num : nums){
            if(!set.contains(num-1)){
                int length = 1;
                int current = num;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
