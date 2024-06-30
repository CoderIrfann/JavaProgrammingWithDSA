import java.util.Scanner;

/**
 * arrayInJava
 */
public class arrayInJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[100];

        marks[0]  = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int avg = (marks[0]+marks[2]+marks[1])/3;
        System.out.println("The percentage of marks is :"+ avg);
    }
}