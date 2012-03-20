public boolean in1To10(int n, boolean outsideMode) {
  if (!outsideMode){
    if (n >= 1 && n <= 10) {
      return true;
    } else {
        return false;
      }
  } else {
      if (n <= 1 || n >= 10) {
        return true;
      } else {
          return false;
        }
    }
}
