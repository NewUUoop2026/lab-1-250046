import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("============================================");
    System.out.print("Enter length of the sides and height of the Equilateral triangle: ");

    int side = sc.nextInt();
    int height = sc.nextInt();

    double area = Math.round(((Math.sqrt(3) / 4) * Math.pow(side, 2)) * 100.0) / 100.0;
    double volume = Math.round((area * height) * 100.0) / 100.0;

    System.out.println("The area is " + area);
    System.out.println("The volume of the Triangular prism is " + volume);
    System.out.println("============================================");
}
