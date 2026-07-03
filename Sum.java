
import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two integers to calculate their sum:");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}