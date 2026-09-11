class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, new ArrayList<>(), 0);
        return result;
    }

    public void backtrack(int[] nums, List<Integer> subset, int idx) {
        result.add(new ArrayList<>(subset));
        for (int i = idx; i < nums.length; i++) {
            subset.add(nums[i]);
            backtrack(nums, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}