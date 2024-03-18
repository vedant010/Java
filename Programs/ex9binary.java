import java.util.Scanner;

public class BinaryToDecimalExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();

        int decimal = Integer.parseInt(binaryStr, 2);
        System.out.println("Binary to Decimal");
        System.out.println(binaryStr + " = " + decimal);

        scanner.close();
    }
}
