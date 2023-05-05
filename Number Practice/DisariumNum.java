import java.util.Scanner;
public class DisariumNum {

	static int countDigits(int x) {
		int count = 0;
		do {
			count++;
			x = x/10;
		}while(x!=0);
		return count;
	}

	static int pow(int num , int power) {
		int product = 1;
		while(power>0) {
			product = product*num;
			power--;
		}
		return product;
	}

	static boolean isDiserium(int a) {
		int cd = countDigits(a);
		int sum = 0, temp = a;

		while(a>0) {
			int d = a%10;
			sum = sum+pow(d, cd);
			cd--;
			a=a/10;
		}
		return sum==temp;
	}
	/*do {
				int d = a%10;
				sum = sum+pow(d, cd);
				a=a/10;
			}while(a!=0);
			return sum ==temp;
		}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int b = sc.nextInt();
		boolean bn= isDiserium(b);
		if(bn==true) {
			System.out.println(b+" is an Diserium Number");
		}
		else {
			System.out.println(b+" is not Diserium Number");
		}

	}

}
