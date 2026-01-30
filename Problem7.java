import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int num1 = sc.nextInt();

    System.out.print("Enter second integer: ");
    int num2 = sc.nextInt();

    System.out.print("Enter third integer: ");
    int num3 = sc.nextInt();

    // Correct min and max
    int min_num = Math.min(Math.min(num1, num2), num3);
    int max_num = Math.max(Math.max(num1, num2), num3);

    // Middle number
    int mid_num = (num1 + num2 + num3) - min_num - max_num;

    System.out.println("Minimum: " + min_num);
    System.out.println("Maximum: " + max_num);
    System.out.println("Middle: " + mid_num);
}
