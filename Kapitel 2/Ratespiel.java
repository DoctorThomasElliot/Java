public class Ratespiel{
	Spieler s1;															// Ratespiel hat drei Insatzvariablen
	Spieler s2;
	Spieler s3; 
	
	public void starteSpiel(){
		s1 = new Spieler();												// Erstellt drei neue Spielerobjekte
		s2 = new Spieler();
		s3 = new Spieler();
		
		int tipp1 = 0;													// Erstellt drei Variablen um die Tipps der Spieler festzuhalten mit Startwert 0
		int tipp2 = 0;
		int tipp3 = 0;
		
		boolean s1hatRecht = false;										// Erstellt drei Variablen um den Gewinner zu deklarieren
		boolean s2hatRecht = false;
		boolean s3hatRecht = false;
		
		int zielZahl = (int) (Math.random() * 10);						// Erstellt eine Zielzahl die von den Spielern erraten werden muss
		System.out.println("Ich denke mir eine Zahl zwischen 0 und 9 aus ...");
		
		while (true) {
			System.out.println("Die zu ratende Zahl ist " + zielZahl);
			
			s1.raten();													// Ruft die Raten-Methode der Spieler auf
			s2.raten();
			s3.raten();
			
			tipp1 = s1.zahl;
			System.out.println("Spieler eins tippte " + tipp1);
			
			tipp2 = s2.zahl;
			System.out.println("Spieler zwei riet " + tipp2);
			
			tipp3 = s3.zahl;
			System.out.println("Spieler drei vermutete " + tipp3);
			
			if (tipp1 == zielZahl){
				s1hatRecht = true;
			}
			if (tipp2 == zielZahl){
				s2hatRecht = true;
			}
			if (tipp3 == zielZahl){
				s3hatRecht = true;
			}
			
			if (s1hatRecht || s2hatRecht || s3hatRecht){
				System.out.println("Wir haben einen Gewinner!");
				System.out.println("Spieler eins hat richtig geraten? " + s1hatRecht);
				System.out.println("Spieler zwei hat richtig geraten? " + s2hatRecht);
				System.out.println("Spieler drei hat richtig geraten? " + s3hatRecht);
				System.out.println("Das Spiel ist aus!");
				break;
			}
			else {
					System.out.println("Die Spieler müssen es erneut versuchen.");
			}
		}
	}
}