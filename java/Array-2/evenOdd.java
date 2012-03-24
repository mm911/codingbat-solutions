public int[] evenOdd(int[] nums) {
  int countE = 0;
  int countO = nums.length-1;
  int[] array = new int[nums.length];
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
      array[countE] = nums[i];
      countE++;
    } 
    else {
      array[countO] = nums[i];
      countO--;
    }
  }
  return array;
}
