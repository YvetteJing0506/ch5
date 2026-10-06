import java.util.Scanner;

public class Quadratic {
	
	public static void main(String[] args) {
		System.out.println("Calculate ax^2+bx+c=0, find roots. Eneter value below.");
		Scanner input = new Scanner(System.in);
		System.out.print("a=");
		int a = input.nextInt();
		System.out.print("b=");
		int b = input.nextInt();
		System.out.print("c=");
		int c = input.nextInt();
		double firstAnswer = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
		double secondAnswer = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
		
		if (a<=0) {
			System.out.println("DNE");
		} 
		if (Math.pow(b, 2)-4*a*c<0) {
			System.out.println("DNE");
		}
		if (Math.pow(b, 2)-4*a*c==0) {
			System.out.print("Only one solution: (" + firstAnswer + ", 0)");
		}
		if (a>0 && Math.pow(b, 2)-4*a*c>0){
			System.out.println("Two solutions: (" + firstAnswer + ", 0) and (" + secondAnswer + ", 0)");
		}
	}
}
