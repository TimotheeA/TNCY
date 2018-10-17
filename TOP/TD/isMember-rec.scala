def isMember(l:List[Int], v:Int): Boolean = {

    if (l == Nil) {          // Condition n°1 : l==Nil
        return false;        // Cas de base n°1 : l == Nil return false
    } 
    else if (l.head == v) { //Condition n°2 : l.head == v
        return true;        //Cas de base n°2 : l.head == v return true
    }
    else {
        isMember(l.tail,v);  //Fonction transfert l -> l.tail
    }
}
