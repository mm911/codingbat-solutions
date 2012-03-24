public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  
  for (int i = 0; i < nums1.length; i++) {
    int tmp = Math.abs(nums1[i] - nums2[i]);
    if (tmp <= 2 && tmp > 0)
      count++;
  }
  return count;
}
