public class FilmTestlauf {
	public static void main(String[] args){
		Film eins = new Film();
		eins.titel = "The Dark Knight";
		eins.genre = "Superhelden";
		eins.bewertung = 2;
		
		Film zwei = new Film();
		zwei.titel = "Star Trek";
		zwei.genre = "Sci-Fi";
		zwei.bewertung = 1;
		zwei.vorfuehren();
	}
}