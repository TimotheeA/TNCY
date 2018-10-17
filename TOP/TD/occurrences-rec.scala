def occurrences(l:List[Int], v:Int): Int = {
	def auxOcc(l:List[Int], v:Int, c:Int): Int = {
		if (l == Nil){
			return c;
		}
		else if (l.head == v) {
			return auxOcc(l.tail, v, c+1);
		  }
		  else {
		    return auxOcc(l.tail, v, c);
		  }
	}

	auxOcc(l, v, 0);

}
