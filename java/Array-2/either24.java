public boolean either24(int[] nums) {
  boolean found2 = false;
  boolean found4 = false;
  
  for (int i = 0;i < nums.length; i++) {
    if (nums[i] == 2 && i < nums.length-1 && nums.length > 1 && nums[i+1] == 2)
      found2 = true;
    if (nums[i] == 4 && i < nums.length-1 && nums.length > 1 && nums[i+1] == 4)
      found4 = true;
  }
  
  if (found2 && found4)
    return false;
  else if (!found2 && !found4)
    return false;
  else
    return true;
  
}
