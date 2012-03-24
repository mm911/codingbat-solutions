public int[] withoutTen(int[] nums) {
  int[] result = new int[nums.length];
  int j = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 10) {
    } else {
      result[j] = nums[i];
      j++;
    }
  }
  
  for(int i = j; i < nums.length; i++) {
    result[i] = 0;
  }
  return result;
}