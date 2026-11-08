class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subseq(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void subseq(int index, int[] nums,
                        List<Integer> current,
                        List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);

        subseq(index + 1, nums, current, result);

        current.remove(current.size() - 1);
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }

        subseq(index + 1, nums, current, result);
    }
}