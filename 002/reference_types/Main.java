package reference_types;

public class Main {
  public static void main(String[] args) {
    boolean forSale = true;

    // $ Reference types
    String name = "Barba";
    String food = "pasta";
    String email = "barba.tech23@gmail.com";
    String car = "BMW";
    String color = "black";

    System.out.println("Hello " + name);
    System.out.println("I like to eat " + food);
    System.out.println("You can contact me at " + email);
    System.out.println("I drive a " + car + " in the color " + color);

    if (forSale) {
      System.out.println("This is a " + car + " for sale");
    } else {
      System.out.println("The " + car + "is not for sale");
    }
  }
}
