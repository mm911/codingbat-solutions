public int userCompare(String aName, int aId, String bName, int bId) {
  if (aName.equals(bName) && aId == bId)
    return 0;
  
  int result = aName.compareTo(bName);
  if (result < 0)
    return -1;
  else if (result > 0)
    return 1;
  else if (aId > bId)
    return 1;
  else
    return -1;
    
}
