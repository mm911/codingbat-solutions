public int maxSpan(int[] nums) {
  int span = 0;
  int tmp = 0;
  
  for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < nums.length; j++) {
      if (nums[i] == nums[j]) {
        tmp = j-i+1;
        span = Math.max(tmp,span);
      }
    }
  }
  return span;
}
