import java.util.Scanner;
public class PrimeNumber_BetweenTwoNumber {

	static boolean primeBetween2Num(int num) {
		
		if(num==0 || num==1)
			return false;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2=sc.nextInt();
		for(int i=num1;i<=num2;i++) {
			if(primeBetween2Num(i)) {
				System.out.println(i);
			}
		}
	}
}