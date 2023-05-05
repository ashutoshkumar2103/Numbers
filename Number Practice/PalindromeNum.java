import java.util.Scanner;

public class PalindromeNum {

	static boolean isPalindrome(int num) {
		int temp = num,sum=0;
		while(num>0) {
			int r = num%10;
			sum = sum*10+r;
			num= num/10;
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
		boolean rs = isPalindrome(num);
		if(rs) {
			System.out.println(num+" is Palindrome NUMber");
		}
		else {
			System.out.println(num+" is not Palindrome NUMber");
		}

	}


}