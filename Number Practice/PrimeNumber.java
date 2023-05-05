import java.util.Scanner;
public class PrimeNumber {

	static boolean primeNum(int x) {
		int count=0;
		for(int i = 1; i<=x; i++) {
			if(x%i==0) {
				count ++;
			}
		}
//		for(int i=2;i<x/2;i++) {
//			if(x%i==0) {
//				return false;
//			}
//		}
//		
		if(count==2) {
			return true;
		}
		return false; // true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int a  = sc.nextInt();
		boolean b = primeNum(a);
		System.out.println(b);

	}
}