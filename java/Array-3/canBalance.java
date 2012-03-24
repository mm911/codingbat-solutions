public boolean canBalance(int[] nums) {
  int lSum = 0;
  
  for (int i = 0; i < nums.length; i++) {
    lSum += nums[i];
    int rSum = 0;
    for (int j = nums.length-1; j > i; j--) {
      rSum += nums[j];
    }
    if (rSum == lSum)
      return true;
  }
  return false;
}
