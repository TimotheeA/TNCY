def isMember(l:List[Int], v:Int): Boolean = {
  if (l == Nil) {
    return false;
  } 
  else if (l.head == v) {
    return true;
  } 
  else {
    isMember(l.tail,v);
  }
}
