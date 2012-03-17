public boolean has271(int[] nums) {
  int len = nums.length;

  for (int i = 0; i < nums.length - 1; i++) {   
    if (i+2 <= nums.length - 1){
      int j = Math.abs(nums[i] - 1);  
      int k = Math.abs(j - nums[i+2]);         
      if(nums[i+1] == nums[i]+5 && k <= 2)
        return true;      
    }    
          
  } return false;
}
