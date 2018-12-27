class SchlagzeugTestlauf{

	public static void main(String[] args){
		
		Schlagzeug s = new Schlagzeug();
		
		s.snare = false;
		
		if (s.snare == true){
			s.spieleSnare();
		}
		
		s.spieleSnare();
		s.spieleTomTom();
		
	}

}