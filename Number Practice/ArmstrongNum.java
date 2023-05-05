import java.util.Scanner;
public class ArmstrongNum {

	static int countDigit(int x) {
		int count = 0;
		do {
			count++;
			x=x/10;
		}while(x!=0);
		return count;
	}

	static int power(int num, int power) {
		int product = 1;
		while(power>0) {
			product = product*num;
			power--;
		}
		return product;
	}

	static boolean isArmStrongNum(int x) {
	int countDigit = countDigit(x), sum=0,temp = x;
		do {
			int digit = x%10;
			sum = sum+power(countDigit, digit);
			x = x/10;
		}while(x!=0);
		return sum==temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int b = sc.nextInt();
		boolean bn= isArmStrongNum(b);
		if(bn==true) {
			System.out.println(b+" is an Armstrong Number");
		}
		else {
			System.out.println(b+" is not Armstrong Number");
		}

	}

}
