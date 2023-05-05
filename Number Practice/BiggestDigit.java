import java.util.Scanner;
public class BiggestDigit {

	static int bigDigit(int x) {
		int l = 0;
		while(x>0) {
			int d1 = x%10;
			if (d1>l) {
				l = d1;
			}
			x = x/10;
		}
		return l;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		int b = bigDigit(a);
		System.out.println(b);
	}
}