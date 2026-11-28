class Solution {
    public boolean isPalindrome(String s) {
        String strs = s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        int right = strs.length()-1;
        int left = 0;
        while(left < right){
            if(strs.charAt(left) != strs.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
