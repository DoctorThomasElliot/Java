public class Random {

	public static void main(String[] args) {
	
		double x;
		x = Math.random();
		System.out.println("Math.random x = " + x);
	
		System.out.println("");
		System.out.println("Part 2");
		int a = 0;
		
		while (a < 20) {
			double y = Math.random()*10;
			System.out.println("Math.random y * 10 = " + y);
			a = a + 1;
		}
	
	}

}