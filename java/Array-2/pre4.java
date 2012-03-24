public int[] pre4(int[] nums) {

  for (int i = 0; i < nums.length; i++) {
    
    if (nums[i] == 4 && i > 0) {
      int[] foo;
      foo = new int[i];
      for (int j = 0; j < foo.length; j++) {
        foo[j] = nums[j];
        
      }
      if (nums[0] != 4)
        return foo;
    }
  }
  int[] bar;
  bar = new int[0];
  return bar;
}
