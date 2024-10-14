import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equaltion = new QuadraticEquation();
        double delta = equaltion.getDiscriminant();

        if (delta >=0) {

            double root1 = (-b + Math.sqrt(delta))/ (2 * a);
            double root2 = (-b - Math.sqrt(delta))/ (2 * a);
            System.out.println("Equaltion có hai roots: " + root1 + " and " + root2 );
        } else if (delta == 0) {
            double rootだけ = -b / (2 * a);
            System.out.println("Equaltion có một root: " + rootだけ);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
        scanner.close();
    }

}