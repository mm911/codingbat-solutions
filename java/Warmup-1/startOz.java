public String startOz(String str) {
  if (str.startsWith("oz"))
    return "oz";
  else if (str.startsWith("o"))
    return "o";
  else if (str.startsWith("z", 1))
    return "z";
  else
    return "";
}
