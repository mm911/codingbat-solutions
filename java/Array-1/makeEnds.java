public int[] makeEnds(int[] nums) {
  int[] myArray = new int[2];
  if (nums.length == 1) {
    myArray[0] = nums[0];
    myArray[1] = nums[0];
  } else {
    myArray[0] = nums[0];
    myArray[1] = nums[nums.length-1];
  }
  
  return myArray;
}
