class Solution {
public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> result = new HashSet<>();

    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {

        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }

        HashSet<Integer> seen = new HashSet<>();

        for (int j = i + 1; j < nums.length; j++) {

            int target = -nums[i] - nums[j];

            if (seen.contains(target)) {
                result.add(List.of(nums[i], target, nums[j]));
            }

            seen.add(nums[j]);
        }
    }

    return new ArrayList<>(result);
}
}
