public String missingChar(String str, int n) {
   StringBuffer buf = new StringBuffer( str.length() - 1 );
   buf.append( str.substring(0,n) ).append( str.substring(n+1) );
   return buf.toString();
}
