def min(l:List[Int]): Int = {
  if (l.tail == Nil){
  	return l.head;
  }
  else {
    return math.min(l.head, min(l.tail));
  }
}
