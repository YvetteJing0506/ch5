import java.util.Random;
public class Triangle {
	  public static void main(String[] args) {
		  Random random = new Random();
		  int a = random.nextInt(10) + 1;
		  int b = random.nextInt(10) + 1;
		  int c = random.nextInt(10) + 1;
		  if (a>b+c || b>a+c || c>a+b) {
			  System.out.println("Cannot form a triangle.");
		  } else {
			  System.out.println("Can form a triangle.");
		  }
	  }
}
