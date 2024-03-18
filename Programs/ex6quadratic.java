import java.util.Scanner;
 class QuadraticRootsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

      
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
          
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("Root 1 = %.2f%n", root1);
            System.out.format("Root 2 = %.2f%n", root2);
        } else if (discriminant == 0) {
         
            double root = -b / (2 * a);
            System.out.format("Root = %.2f%n", root);
        } else {
         
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("Root 1 = %.2f + %.2fi%n", realPart, imaginaryPart);
            System.out.format("Root 2 = %.2f - %.2fi%n", realPart, imaginaryPart);
        }

        scanner.close();
    }
}
