import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("Fizzbuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("Fizz");
        }
        else {
            if (number % 3 == 0) {
                System.out.println("Buzz");
            }
        }
        System.out.println(number);
    }
}
