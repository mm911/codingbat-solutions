public boolean sum28(int[] nums) {
  int sum = 0;
  boolean is8 = false;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2)
      sum += 2;
  }
  if (sum == 8)
    is8 = true;
  return is8;
}
