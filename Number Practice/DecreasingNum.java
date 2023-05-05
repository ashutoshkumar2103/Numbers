import java.util.Scanner;
public class DecreasingNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int m = 2*n-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=m; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			if(i<n) {
				m = m-1;
			}
		}
	}
}

class DecreasingNum1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int m = 2*n-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=m; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
			if(i<n) {
				m = m-1;
			}
		}
	}
}