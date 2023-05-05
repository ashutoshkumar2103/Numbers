import java.util.*;
public class Roman {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		String rm=numToRoman(n);
		sc.close();
		System.out.println(n+" value in Roman is: "+rm);
	}

	private static String numToRoman(int n) {
		int values[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String romanLetters[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String rm="";
		for (int i = 0; i < values.length; i++) {
			while(n>=values[i]) {
				n=n-values[i];
				rm=rm+romanLetters[i];
			}
		}
		return rm;
		
		
	}
}
