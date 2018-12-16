public class Baby{
	public static void main (String[] args){
		int x = 7;
		int y = x + 3;
		int z = x + y;
		String name = "Thomas";
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Mein Name ist " + name + "!");
		System.out.println("x + y = " + z);
	
		//while loop, you need to set a before the loop
		int a = 10;
		while (a > 0) {
			System.out.println("Countdown: " + a);
			a = a - 1;
			}
		//this countdown goes from 10 to 1
		
		//for loop, you do not need to set b before the loop
		for (int b = 0; b < 10; b = b +1) {
			System.out.println("Anti-Countdown: " + b);
			}
		//this anti-countdown goes from 0 to 9
		
		if (name == "Thomas") {
			System.out.println(name + ", du hast dieses Programm geschrieben! Gratulation!");
			}
		
		// UND &&	beide wahr
		// ODER ||	einer oder beide wahr
		// NICHT !	nicht wahr
		// XOR != 	nur einer wahr
		if ( (name == "Thomas") && (x == 7)) {
			System.out.println("Jo!");
			}
		
		//Variablen können auch in zwei Schritten deklariert werden
		int d;
		d = x + y + z;
		System.out.println(d);
		
		int e = 1;
		while (e < 100){
			//Kurzschreibweise für e = e + 1
			e++;
			}
		System.out.println("Jetzt ist e " + e);
			
	}
}