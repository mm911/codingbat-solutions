public int[] makeMiddle(int[] nums) {
  int[] myArray = new int[2];
  int middle = nums.length / 2;
  
  myArray[0] = nums[middle - 1];
  myArray[1] = nums[middle];
  
  return myArray;
}
