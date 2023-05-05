// A special two-digit number is such that when the sum of its digits is added to the product of its digits, the result is equal to the original two-digit number.
import java.util.Scanner;	//59
public class SpecialNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = sc.nextInt();
		
		int p1 = a%10;
		int p2 = a/10;
		
		int p = p1+p2+(p1*p2);
		if(p==a) {
			System.out.println(a + " is Special Number");
		}
		else {
			System.out.println(a+ " is not a Special Number");
		}
		
	}
	
	
}
