import java.util.Scanner;

 class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}
