import java.util.Scanner;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter fist number : ");
        int num1 = userInput.nextInt();

        System.out.print("Enter second number :");

        int num2 = userInput.nextInt();
        int sum = num1 + num2;
        System.out.print("The Sum of " + num1 + " & " + num2 + " = " + sum);
    }
}