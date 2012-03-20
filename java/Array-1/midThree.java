public int[] midThree(int[] nums) {
  int[] myArray = new int[3];
  int middle = nums.length / 2;
  myArray[0] = nums[middle-1];
  myArray[1] = nums[middle];
  myArray[2] = nums[middle+1];
  return myArray;
  
}
