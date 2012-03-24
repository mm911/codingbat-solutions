public int[] copyEvens(int[] nums, int count) {
  int ctr = 0;
  int[] array = new int[count];
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
      array[ctr] = nums[i];
      ctr++;
    }
      if (ctr == count)
        return array;
  }
  return nums;
}
