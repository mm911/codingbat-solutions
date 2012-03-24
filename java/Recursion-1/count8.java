public int count8(int n) {
  if (n < 1) return 0;
  if (n % 10 == 8 && (n / 10) % 10 == 8) return 2 + count8(n/10);
  else if (n % 10 == 8) return 1 + count8(n/10);
  else return count8(n/10);
}
