public int close10(int a, int b) {
  int temp1 = Math.abs(a - 10);
  int temp2 = Math.abs(b - 10);

  if (temp1 == temp2)
    return 0;
  else if (temp1 > temp2)
    return b;
  else 
    return a;
}
