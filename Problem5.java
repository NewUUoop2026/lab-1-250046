import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the driving distance: ");
    float distance = sc.nextFloat();
    System.out.print("Enter miles per gallon: ");
    float miles = sc.nextFloat();
    System.out.print("Enter price per gallon: ");
    float price = sc.nextFloat();
    float total_cost = (distance / miles)*price;
    System.out.printf("The cost of driving is: $ %.2f%n", total_cost);
}
