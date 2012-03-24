public String[] mergeTwo(String[] a, String[] b, int n) {
  String out[] = new String[n];
  int aindex =0, bindex=0;
  for(int i=0; i<n; i++)
  {
    int cmp = a[aindex].compareTo( b[bindex] );
    if(cmp<=0)
    {
      out[i] = a[aindex++];
      if(cmp == 0) bindex++;
    }
    else
    {
      out[i] = b[bindex++];
    }
  } 
  return out;
}