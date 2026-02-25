import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double side1;
        double side2;
        double side3;
        String color;
        boolean filled = false;

        System.out.println("Input the length of the first side of the triangle: ");
        side1 = scanner.nextDouble();

        System.out.println("Input the length of the second side of the triangle: ");
        side2 = scanner.nextDouble();

        System.out.println("Input the length of the third side of the triangle: ");
        side3 = scanner.nextDouble();
        
        scanner.nextLine();

        System.out.println("Input a color: ");
        color = scanner.nextLine();

        System.out.println("Input 1 if filled in, 0 if not: ");
        int inputfilled = scanner.nextInt();
        switch (inputfilled) {
            case 0:
                filled = false;
                break;
            case 1:
                filled = true;
            default:
                break;
        }

        try {
            Triangle triangle = new Triangle(side1, side2, side3, color, filled);
            System.out.println(triangle.toString());
            System.out.println("Area = " + triangle.getArea());
            System.out.println("Perimeter = " + triangle.getPerimeter());
            System.out.println("Color = " + triangle.getColor());
            System.out.println("Filled in = " + triangle.isFilled());
        } catch (IllegalTriangleException e) {
            System.out.println("Invalid Triangle Construction: The sum of two sides must always be larger than the third");
            e.printStackTrace();
            System.exit(0);
        }
    }
}
