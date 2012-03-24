public int countClumps(int[] nums) {
  boolean match = false;
  int count = 0;
  for (int i = 0; i < nums.length-1; i++) {
    if (nums[i] == nums[i+1] && !match) {
      match = true;
      count++;
    } 
    else if (nums[i] != nums[i+1]) {
      match = false;
    }
  }
  return count;
}
