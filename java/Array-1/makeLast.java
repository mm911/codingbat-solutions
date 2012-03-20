public int[] makeLast(int[] nums) {
  int len = nums.length;
  int[] myArray = new int[2*len];
  myArray[myArray.length-1] = nums[len-1];
  return myArray;
}
