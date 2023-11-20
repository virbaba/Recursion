public Solution(
  public static boolean checkAB(String s){
  if(s.length == 0)
    return true;
if(s.charAt(0) == 'a')
{
  if(s.substring(1).length() > 1 && str.substring(1, 3) == "bb")
  {
    return checkAB(s.substring(3));
  }
  else{
    return checkAB(s.substring(1));
  }
  return false;
}
}
