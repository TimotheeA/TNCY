def butLast(l:List[Int]): List[Int] = {
  if (l.tail == Nil){
    return Nil;
  }
  else {
    return l.head::butLast(l.tail);
  }
}
