class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer>count = new HashMap<>();
        for (int num :nums){
            if (count.getOrDefault(num, 0) >= 1){
                return true;
            }
            count.put(num, 1);
        }
        return false;
    }
}