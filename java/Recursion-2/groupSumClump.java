public boolean groupSumClump(int start, int[] nums, int target) {
  altArray(nums);
  if (start >= nums.length) return target == 0;
  if (groupSumClump(start+1, nums, target-nums[start])) return true;
  if (groupSumClump(start+1, nums, target)) return true;
  else return false;  
}

private void altArray(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (i > 0 && nums[i] == nums[i-1]) {
      nums[i-1] += nums[i];
      if (i+1 < nums.length && nums[i] != nums[i+1])
        nums[i] = 0;
      else if (i == nums.length-1)
        nums[i] = 0;
    }
  }
}