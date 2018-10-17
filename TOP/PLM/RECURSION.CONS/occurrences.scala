def occurrences(l:List[Int], v:Int): Int = {
  if (l == Nil){
    return 0;
  }
  else if (l.head == v) {
    return 1 + occurrences(l.tail, v);
  }
  else {
    return 0 + occurrences(l.tail, v);
  }
}
