import java.util.Scanner;

public class swith {
    public static void main(String[] args) {
        char operation;
        Scanner sc = new Scanner(System.in);
        operation = sc.next().charAt(0);

        int number = 3;
        int number2 = 5;

        switch (operation) {
            case '+':
                System.out.println(number + number2);
                break;
            case '-':
                System.out.println(number - number2);
                break;
            case '*':
                System.out.println(number * number2);
                break;
            case '/':
                System.out.println(number / number2);
                break;

            default:
            System.out.println("Something wents wrong");
                break;
        }
    }

}
