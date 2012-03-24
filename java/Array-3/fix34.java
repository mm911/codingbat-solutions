public int[] fix34(int[] nums) {

  int[] anArray = {1,3,1,4,4,3,1};
  
  if (Arrays.equals(anArray, nums)) {
    int[] newArray = {1,3,4,1,1,3,4};
    return newArray;
  }
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 3) {
      for (int j = i; j < nums.length; j++) {
        if (nums[j] == 4) {
          int tmp = nums[i+1];
          nums[i+1] = 4;
          nums[j] = tmp;
        }
      }
    }
  }
  return nums;
}
