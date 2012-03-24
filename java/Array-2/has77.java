public boolean has77(int[] nums) {  
  if (nums.length < 2)
    return false;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 7 && i < nums.length-1 && nums[i+1] == 7)
      return true;
    if (nums[i] == 7 && i < nums.length-2 && nums[i+2] == 7)
      return true;  
  }
  return false;
}
