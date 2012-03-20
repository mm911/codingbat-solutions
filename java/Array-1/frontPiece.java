public int[] frontPiece(int[] nums) {
  int[] myArray = new int[2];

  if (nums.length < 2)
    return nums;
  else {
    myArray[0] = nums[0];
    myArray[1] = nums[1];
    return myArray;
  }
}
