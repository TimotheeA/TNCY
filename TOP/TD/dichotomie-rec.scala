def dichotomie(tab:Array[Int], e:Int, borne_inf:Int, borne_sup:Int):Int = {
	if (borne_sup == borne_inf) {
		if (tab(borne_sup) == e){
			return borne_sup;
		}
		else {
			return -1 + borne_sup;
		}
	}
	else if (tab(borne_sup+borne_inf)/2 =< e){
		return dichotomie(tab,e,borne_inf,(borne_sup+borne_inf)/2);
	}
	else {
		return dichotomie(tab,e,(borne_sup+borne_inf)/2, borne_sup);
	}

}
