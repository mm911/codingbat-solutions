public int maxTriple(int[] nums) {
  int largest = Math.max(nums[0], nums[nums.length / 2]);
  largest = Math.max(largest, nums[nums.length-1]);
  return largest;
}
