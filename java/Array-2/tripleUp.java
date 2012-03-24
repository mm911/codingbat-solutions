public boolean tripleUp(int[] nums) {
  boolean foo = false;
  int count = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (i < nums.length-1) {
      int sum = nums[i+1] - nums[i];
      if (sum == 1)
        count++;
      else
        count = 0;
    }
    if (count == 2)
      foo = true;
  }
  return foo;
}
