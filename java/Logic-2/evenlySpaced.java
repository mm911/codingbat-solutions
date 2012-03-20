public boolean evenlySpaced(int a, int b, int c) {
  int[] anArray = {a, b, c};
  Arrays.sort(anArray);

  int diffLow = anArray[1] - anArray[0];
  int diffHi = anArray[2] - anArray[1];

  if (diffLow == diffHi)
    return true;
  else
    return false;  
}
