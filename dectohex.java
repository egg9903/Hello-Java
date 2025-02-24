import java.util.Scanner;

public class DecimalToHexConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String hexNumber = Integer.toHexString(decimalNumber).toUpperCase();

        System.out.println("Hexadecimal equivalence: " + hexNumber);

        scanner.close();
    }
}
