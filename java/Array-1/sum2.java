public int sum2(int[] nums) {
  if (nums.length == 1)
    return nums[0];
  if (nums.length == 0)
    return 0;
  
  return nums[0] + nums[1];
}
