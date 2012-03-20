public String alarmClock(int day, boolean vacation) {
  if (vacation) {
    if(day > 0 && day != 6)
      return "10:00";
    else
      return "off";
  } else if (day > 0 && day != 6)
      return "7:00";
    else
      return "10:00";
    
}
