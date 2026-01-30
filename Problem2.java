import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("============================================");
    System.out.print("Enter the radius and length of a cylinder: ");
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double pi = 3.1415926535;
    double area = x*x*pi;
    System.out.println("The area is " + Math.round((area)));
    System.out.println("The volue is " + Math.round((area*y)));
    System.out.println("============================================");
}
