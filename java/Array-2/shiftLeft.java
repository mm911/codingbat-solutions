public int[] shiftLeft(int[] nums) {  
  int[] foo;
  foo = new int[nums.length];
  
  if (nums.length == 0)
    return foo;
  
  for (int i = 0; i < nums.length-1; i++) {
    if (i > 0)
      foo[i] = nums[i+1];
  }
  if (nums.length > 1)
    foo[0] = nums[1];
  foo[nums.length-1] = nums[0];
  return foo;
}
