def increasing(l:List[Int]): Boolean = {
  if (l == Nil){
    return false;
  }
  else if (l.tail == Nil){
    return true;
  }
  else if (l.head <= l.tail.head) {
    return increasing(l.tail);
  }
  else {
    return false;
  }
}
