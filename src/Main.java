import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Beräkna avståndet mellan två punkter (x1, y1) och (x2, y2)
        // Formel: roten ur( (x1-x2)² + (y1-y2)² )

        Scanner input = new Scanner(System.in);
        System.out.print("Vänligen ange x1: ");
        double x1 = input.nextDouble();
        System.out.print("Vänligen ange y1: ");
        double y1 = input.nextDouble();
        System.out.print("Vänligen ange x2: ");
        double x2 = input.nextDouble();
        System.out.print("Vänligen ange y2: ");
        double y2 = input.nextDouble();

        double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        System.out.println("Avståndet mellan de två punkterna är " + distance);
    }
}