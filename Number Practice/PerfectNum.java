// A number whose sum of factors 
// (excluding the number itself)
// is equal to the number is called a perfect number
import java.util.Scanner;	//28
public class PerfectNum {

	static boolean isPerfectNum(int num) {
		int sum=0,temp=num;
		for (int i=1; i<=num/2; i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(temp==sum) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		boolean rs = isPerfectNum(num);
		if (rs) {
			System.out.println(num+" is Perfect Number");
		}
		else {
			System.out.println(num+" is not Perfect Number");
		}
	}
}