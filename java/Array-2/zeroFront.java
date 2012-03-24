public int[] zeroFront(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      nums[i] = nums[count];
      nums[count] = 0;
      count++;
    }
  }
  return nums;
}
