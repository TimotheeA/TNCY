override def run() {
  def squareL() {
    for ( i <- 1 to 4) {  
  	avance(100);
  	gauche(90);
  	}
  }
  
	for ( i <- 1 to 4) {
    squareL();
    gauche(90);
  }
}
