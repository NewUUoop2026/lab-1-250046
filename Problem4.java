import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Write the meal cost: ");
    float meal_cost = sc.nextFloat();
    float tax = meal_cost*0.15f;
    float tip = meal_cost*0.18f;
    float grand_total =  meal_cost + tax + tip;
    System.out.printf("The tax amount: %.2f%n", tax);
    System.out.printf("The tip amount: %.2f%n", tip);
    System.out.printf("The Grand Total: %.2f%n", grand_total);
}
