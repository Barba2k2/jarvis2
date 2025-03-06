import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // System.out.println(Math.PI);
    // System.out.println(Math.E);

    // double result;

    // result = Math.pow(2, 3); // = 2^3
    // result = Math.abs(-5);
    // result = Math.sqrt(9);
    // result = Math.round(Math.PI); // round down
    // result = Math.ceil(Math.PI); // round up
    // result = Math.floor(Math.PI);
    // result = Math.max(10, 20);
    // result = Math.min(10, 20);

    // System.out.println(result);

    // HYPOTENUSE - c = Math.sqrt(a² + b²)

    Scanner scanner = new Scanner(System.in);

    double radius;
    double circumference;
    double area;
    double volume;

    System.out.print("Enter radius: ");
    radius = scanner.nextDouble();

    circumference = 2 * Math.PI * radius;
    area = Math.PI * Math.pow(radius, 2);
    volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

    System.out.printf("The Circumference is: %.1fcm\n", circumference);
    System.out.printf("The area is: %.1fcm²\n", area);
    System.out.printf("The volume is: %.1fcm³\n", volume);

    scanner.close();
  }
}
