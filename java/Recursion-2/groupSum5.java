public boolean groupSum5(int start, int[] nums, int target) {
  if (start >= nums.length) return (target == 0);
  if (groupSum5(start+1, nums, target-nums[start]) && checkOne(start, nums))
    return true;
  if (nums[start] % 5 != 0 && groupSum5(start+1, nums, target)) return true;
  return false;
}

private boolean checkOne(int start, int[] nums) {
  if (start == 0) return true;
  if (start > 0 && nums[start-1] % 5 == 0 && nums[start] == 1)
    return false;
  else
    return true;
}