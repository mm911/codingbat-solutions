public int[] front11(int[] a, int[] b) {
  if (a.length == 0 && b.length == 0) {
    return a;
  }
  if (a.length == 0) {
    int[] myArray = new int[] {b[0]};
    return myArray;
  }
  
  if (b.length == 0) {
    int[] myArray = new int[] {a[0]};
    return myArray;
  }
  
  int[] myArray = new int[] {a[0], b[0]};
  return myArray;    
}
