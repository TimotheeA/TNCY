def last(l:List[Int]): Int = {
  if (l.tail == Nil){
    return l.head;
  }
   else {
     return last(l.tail);
   }
}
