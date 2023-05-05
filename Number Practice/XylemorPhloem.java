import java.util.Scanner;
public class XylemorPhloem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		boolean rs = isXylem(num);
		if (rs) {
			System.out.println(num+" is Xylem Number");
		}
		else {
			System.out.println(num+" is Phloem Number");
		}	
		sc.close();
	}

	
	static boolean isXylem(int num) {
		int fstLstDigSum = 0, allMidDigSum = 0;   //12337
		fstLstDigSum = num%10;  //7
		num = num/10;  //1233

		while(num>9) {  //1233, 123, 12
			int d = num%10;   //3, 3, 2
			allMidDigSum = allMidDigSum+d;  // 0+3=3, 3+3=6, 6+2=8
			num = num/10;  //123, 12, 1
		}
		fstLstDigSum = fstLstDigSum+num; //7+1=8

		if(fstLstDigSum==allMidDigSum) {
			return true;
		}
		return false;
	}
}