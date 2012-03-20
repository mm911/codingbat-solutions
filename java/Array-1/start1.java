public int start1(int[] a, int[] b) {
  int count = 0; 
  if (a.length > 0 && a[0] == 1)
    count++;
  if (b.length > 0 && b[0] ==1)
    count++;
  return count;
 
}
