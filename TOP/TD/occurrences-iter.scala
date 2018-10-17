def occurrences(li:List[Int], n:Int): Int = {

	l = li;   						//copie des variables
	v = n;
	c = 0;

	while (l != Nil){
		if(l.head == v){
			++c;
		}
		else {
			//rien
		}
		l = l.tail
	}
	
	return c;
	}
}
