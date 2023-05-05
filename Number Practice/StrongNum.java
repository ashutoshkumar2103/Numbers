import java.util.Scanner;
public class StrongNum {

	static int fact(int x) {
		int fact= 1;
		while(x>0) {
			fact = fact*x;
			x--;
		}
		return fact;
	}
	static boolean isStrongNum(int num) {
		int sum = 0,temp = num;
		while(num!=0) {
			int r = num%10;
			sum = sum+fact(r);
			num = num/10;
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
		boolean rs = isStrongNum(num);
		if (rs) {
			System.out.println(num+" is Strong Number");
		}
		else {
			System.out.println(num+" is not Strong Number");
		}	
	}	
}