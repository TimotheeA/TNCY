def isMember(li:List[Int], n:Int): Boolean = {
	
	l = li;   						//copie des variables
	v = n;

	while(l.head != v && l != Nil){ //conditions
		l = l.tail;					//fonction transfert	
	}
	if (l.head == v){				//cas de base
		return true;
	}
	else {
		return false;
	}
}
