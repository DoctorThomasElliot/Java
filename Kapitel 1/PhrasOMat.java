public class PhrasOMat{

	public static void main(String[] args) {
	
		//Drei Wortgruppen werden erstellt, aus welchen wir dann die Wörter auswählen
		String[] wortlisteeins = {"verl\u00E4ssliche", "erfolgsorientierte", "webbassierte", "allumfassende", "clevere", "kundenorientierte", "pfadkritische", "dynamische", "konkurrenzf\u00E4hige", "verteilte", "zielgerichtet", "agile"};
		String[] wortlistezwei = {"gepowerte", "haftende", "Mehrwert-", "zentrierte", "geclusterte", "proaktive", "Out-of-the-box", "Enterprise-", "fokusierte", "offene", "diverse", "multi-level", "nicht-zentrale"};
		String[] wortlistedrei = {"Schicht", "Endstufe", "L\u00F6sung", "Architektur", "Ausrichtung", "Kernkompetenz", "Strategie", "Vision", "Zukunft", "Mission", "Dimension"};
		
		// Wörter innerhalb der Listen zählen
		int einslänge = wortlisteeins.length;
		int zweilänge = wortlistezwei.length;
		int dreilänge = wortlistedrei.length;
		
		// Zufallszahlen generieren um Wörter aus den Listen zu ziehen
		int randeins = (int) (Math.random() * einslänge);
		int randzwei = (int) (Math.random() * zweilänge);
		int randdrei = (int) (Math.random() * dreilänge);
		
		// Die Phrase zusammenbauen
		String bullshit = wortlisteeins[randeins] + " " + wortlistezwei[randzwei] + " " + wortlistedrei[randdrei];
		System.out.println("Was wir brauchen, ist eine " + bullshit + ".");
	}

}