public int[] rotateLeft3(int[] nums) {
  int[] myArray = new int[3];
  
  myArray[0] = nums[1];
  myArray[1] = nums[2];
  myArray[2] = nums[0];
  return myArray;
}
