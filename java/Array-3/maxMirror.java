public int maxMirror(int[] nums) {
  int len = nums.length;
  int count= 0;
  int max = 0;
  for (int i = 0; i < len; i++){
    count=0;
    for (int j = len-1; i + count < len && j > -1; j--){
      if(nums[i+count] == nums[j]){
        count++;
      }
      else{
        if (count > 0){
          max = Math.max(count,max);
          count = 0;
        }
      }
    }
    max = Math.max(count,max);
  }
  return max;
}