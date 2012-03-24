public int[] post4(int[] nums) {
  for (int i = nums.length-1; i >= 0; i--) {
    if (nums[i] == 4) {
      int[] foo;
      foo = new int[nums.length-i-1];

      for (int j = 0; j < foo.length; j++) {
        foo[j] = nums[i+j+1];
      }
      return foo;
    }
  }
  
  int[] bar;
  bar = new int[0];
  return bar;
}
