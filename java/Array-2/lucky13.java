public boolean lucky13(int[] nums) {
  boolean no13 = true;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1 || nums[i] == 3)
      no13 = false;
  }
  return no13;
}
