import java.util.Scanner;
public class HappyNum {

	static boolean isHpappyNumber(int x) {
		
		while(x>9) {
			int temp = x;
			int sum = 0;
			
			while (temp>0) {
			int remainder = temp%10;
			sum = sum+remainder*remainder;
			temp =  temp/10;
			}
			
			x = sum;
		}
		
		if(x==1||x==7) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		boolean rs = isHpappyNumber(num);
		if (rs) {
			System.out.println(num+" is Happy NUmber");
		}
		else {
			System.out.println(num+" is not Happy NUmber");
		}
	}

}
