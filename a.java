import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        // int sum = 0;
        // for(int i=0; i <= 10; i++){
        // // System.out.println(i);
        // System.out.println("Calculating sum of 1, 10 natural number");
        // System.out.println(i);
        // sum = sum+i;
        // System.out.println("sum is :"+sum);

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number. Ensure your number is Positive");
        // int PositiveNumber = sc.nextInt();
        // if (PositiveNumber >= 0) {
        // System.out.println("You choose positive number");
        // for (int i = 0; i <= 10; i++) {
        // System.out.println(PositiveNumber + " * " + i + " = " + PositiveNumber * i);
        // }
        // }
        // System.out.print("Enter your number");
        // int number = sc.nextInt();
        // for (int i = 0; i <= number; i++) {
        // int Factorial = 1;
        // for (int j = 1; j <= i; j++) {
        // Factorial *= j;
        // System.out.println("Factorial is " + Factorial);

        // }
        // }

        // System.out.print("Enter the value :");
        // int number = sc.nextInt();

        // System.out.println("Enter the value that is power of another number");
        // int power = sc.nextInt();

        // int result = 1;
        // if(result > 0){

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if (a > b && a > c) {
        // System.out.println("A is Oldest than B and B");

        // } else if (b > c && b > a) {
        // System.out.println("B is Oldest then A and B");
        // } else if (c > a && c > b) {
        // System.out.println("C is Oldest then A and B");
        // } else {
        // System.out.println("Wrong input");
        // }

        // if (a < b && a < c) {
        // System.out.println("A is Youngest than B and C");
        // } else if (b < c && b < a) {
        // System.out.println("B is Youngest than A and C");
        // } else if (c < a && c < b) {
        // System.out.println("C is Youngest then a and b");
        // } else {
        // System.out.println("Wrong input");
        // }
        // for(int i = 0; i <=5; i++){
        // int factorial = 1;
        // for(int j = 1; j<=5;j++){
        // factorial *= j;
        // System.out.println(factorial);
        // }
        // }

        // System.out.print("How much class you will Attend :");
        // int Class = sc.nextInt();
        // System.out.print("What is your attendence :");

        // int attendence = sc.nextInt();

        // int TotalClass = 100;
        // int percentage = (Class*attendence)/TotalClass;
        // if(percentage > 75){
        // System.out.println("You are eligible for exam");

        // }else{
        // System.out.println("Not eligible for exam");
        // }

        int number = sc.nextInt();

        
        if(number <= 1){
            return false;
        }else{
            for(int i=0; i<= Math.sqrt(number); i++){
                if(number %2 == 0){
                    System.out.println("Prime Number");
                }else{
                    System.out.println("Not a prime number");
                }

            }
        }

    }

}
