public boolean arrayFront9(int[] nums) {
  int len = nums.length;
  
  if (len <= 4){
    for (int i = 0; i < len; i++){
      if (nums[i] == 9)
        return true;
      else;
    }
  } else {
      for (int j = 0; j < 4; j++) {
        if (nums[j] == 9)
          return true;
        else;
      }
    }
    
  return false;
}
