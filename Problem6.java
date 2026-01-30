import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter FOUR digits number: ");
    int four_digits = sc.nextInt();
    int sum=0;
    int temp = four_digits;
    String result = "";

    while (temp>0) {
        int digit = temp%10;
        sum += digit;
        result = digit + (result.isEmpty() ? "" : "+") + result;
        temp /= 10;
    }
    System.out.println(result + "=" + sum);
}
