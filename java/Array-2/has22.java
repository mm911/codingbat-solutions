public boolean has22(int[] nums) {
  boolean found = false;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2 && i > 0 && nums[i-1] == 2) {
      found = true;
    }
    if (nums[i] == 2 && i < nums.length-1 && nums[i+1] == 2) {
      found = true;
    }
  }
  return found;
}
