public boolean linearIn(int[] outer, int[] inner) {
  int numFound = 0;
  if(inner.length == 0) {
     return true;
  }
 
  int k = 0;
  for(int i = 0; i < outer.length; i++) {
     if(outer[i] == inner[k]) {
        numFound++;
        k++;
     } else if(outer[i] > inner[k]) {
        return false;
     }
    
     if(numFound == inner.length)
        return true;
  }
     
  return false;
}