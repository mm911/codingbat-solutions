public int[] notAlone(int[] nums, int val) {
  for (int i = 0; i < nums.length; i++) {
    if (i > 0 && i < nums.length-1 && nums[i] == val) {
      if (nums[i] != nums[i-1] && nums[i] != nums[i+1])
      nums[i] = Math.max(nums[i-1], nums[i+1]);
      
    }
  }
  return nums;
}
