// if the sum and product of its digits are equal
import java.util.Scanner;
public class Spy_Number {

	static boolean spyNum(int n) {
		int sum=0, mul=1;
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			mul=mul*d;
			n=n/10;
		}
		return sum==mul;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		boolean number=spyNum(n);
		if(number) {
			System.out.println(n+" is Spy Number");
		}
		else {
			System.out.println(n+" is not Spy Number");
		}
	}
}