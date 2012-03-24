public boolean sameEnds(int[] nums, int len) {
  boolean foo = true;
  
  for (int i = 0; i < len; i++) {
    if (nums[i] == nums[nums.length-len+i])
      foo = true;
    else
     foo = false; 
  }  
  return foo;
}
