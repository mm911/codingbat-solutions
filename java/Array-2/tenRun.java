public int[] tenRun(int[] nums) {
  boolean ten = false;
  int tmp = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 10 == 0) {
      tmp = nums[i];
      ten = true;
    }
    else if (nums[i] % 10 != 0 && ten) {
      nums[i] = tmp;
    } 
  }
  return nums;
}

