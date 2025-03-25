import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Temperature Converter");
        System.out.print("Enter the temperature: ");
        double fahrenheit = scanner.nextDouble();

        // Convert F to C
        double celsius = 5.0 / 9 * (fahrenheit - 32);
        celsius = (Math.round(celsius*100.0)/100.0);
        // Display result with two decimal places for celsius
        System.out.println(Math.round(fahrenheit) + "F degree is equivalent to " + celsius + "C" );

    }
}
