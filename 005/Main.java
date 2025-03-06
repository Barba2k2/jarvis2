public class Main {
    public static void main(String[] args) {
        // Arithmetic Operations

        int x = 10;
        int y = 2;
        int z;

         z = x + y;
        // z = x - y;
        // z = x * y;
        // z = x / y;
        // z = x % y;

        System.out.println(z);

        // Augmented Assignment Operations

        int x1 = 10;
        int y1 = 3;
        int z1;

        //  x1 = x1 + y1;
        x1 += y1;

        // x1 = x1 - y1;
        // x1 -= y1;

        // x1 = x1 * y1;
        // x1 *= y1;

        // x1 = x1 / y1;
        // x1 /= y1;

        // x1 = x1 % y1;
        // x1 %= y1;

        System.out.println(x1);

        // Increment and Decrement Operators

        int x2 = 1;

        // x2 += x2;
        x2++;

        // x2 = x2 - 1;
        // x2--;

        System.out.println(x2);

        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        // PARENTHESES
        // EXPONENTS
        // MULTIPLICATION
        // DIVISION
        // ADDITION
        // SUBTRACTION
        // PLEASE EXCUSE MY DOPE ASS SWAG

        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }
}
