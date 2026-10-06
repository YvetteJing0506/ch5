import java.util.Random;

public class Fermat {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int n = random.nextInt(98)+3;
		int a = 3;
		int b = 6;
		int c = 5;
		
		if (n>2 && Math.pow(a,n)+Math.pow(b,n)==Math.pow(c,n)) {
			System.out.println("Holy smokes, Fermat was wrong!");
		}
		else {
			System.out.println("No, that doesn't work. ");
		}
	}
}
