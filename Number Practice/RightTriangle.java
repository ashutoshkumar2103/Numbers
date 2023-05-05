import java.util.Scanner;
public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        if (isRightTriangle(a, b, c)) {
            System.out.println("Right Triangle");
        } else {
            System.out.println("Not a Right Triangle");
        }
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        int largest = a;
        if (b > largest) {
        	largest = b;
        }
        if (c > largest) {
        	largest = c;
        }
        int sumOfTwoSide = 0;
        if (largest == a) {
            sumOfTwoSide = b * b + c * c;
        }
        else if (largest == b) {
            sumOfTwoSide = a * a + c * c;
        }
        else {
            sumOfTwoSide = a * a + b * b;
        }
        return sumOfTwoSide == largest * largest;
    }
}
