import java.util.Scanner;
public class PrimeDigit {
	
	static int primeDigit(int x) {
		int count = 0;
		while(x>0) {
			int d = x%10;
			if(d==2 || d==3 || d==5 || d==7) {
				count++;
			}
			x = x/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		int b = primeDigit(a);
		System.out.println(b);
	}
}