import java.util.Scanner;
public class FactorialofNum {
	static int fact(int x) {
		int fact= 1;
		while(x>0) {
			fact = fact*x;
			x--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number= ");
		int a = sc.nextInt();
		int b = fact(a);
		System.out.println(a+"! is "+b);
	}
}
