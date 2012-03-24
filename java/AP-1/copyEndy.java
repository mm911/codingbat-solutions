public int[] copyEndy(int[] nums, int count) {
  int ctr = 0;
  int[] array = new int[count];
  for (int i = 0; i < nums.length; i++) {
    if (isEndy(nums[i])) {
      array[ctr] = nums[i];
      ctr++;      
    }
    if (ctr == count)
      return array;
  }
  return array;
}

private boolean isEndy(int n) {
  return (n >= 0 && n <= 10) || (n <= 100 && n >= 90);
}