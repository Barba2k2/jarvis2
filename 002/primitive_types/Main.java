package primitive_types;

public class Main {
  public static void main(String[] args) {
    // $ Primitive types
    int age = 30;
    int year = 2025;
    int quantity = 1;

    System.out.println("My age is " + age + " years old");
    System.out.println("This year is " + year);
    System.out.println("I have " + quantity + " things");

    double price = 19.99;
    double gpa = 3.5;
    double temperature = -12.5;

    System.out.println("R$" + price);
    System.out.println("GPA: " + gpa);
    System.out.println("Temperature: " + temperature);

    char grade = 'A';
    char symbol = '!';
    char currency = '$';

    System.out.println("Grade: " + grade);
    System.out.println("Symbol: " + symbol);
    System.out.println("Currency: " + currency);

    boolean isStudent = true;
    boolean forSale = false;
    boolean isOnline = true;

    System.out.println("For sale: " + forSale);
    System.out.println("Is online: " + isOnline);

    if (isStudent) {
      System.out.println("You are a student!");
    } else {
      System.out.println("You are not a student!");
    }

  }
}
