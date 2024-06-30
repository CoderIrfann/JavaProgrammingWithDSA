import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // Question number is prime or not
        // boolean isPrime = true;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your number :");
        // int n = sc.nextInt();
        // if(n == 0){
        // System.out.println("Prime Number");
        // }else{
        // for(int i = 2; i<n-1; i++){
        // if(n %i ==0){
        // isPrime = false;
        // }
        // }
        // if(isPrime ==true){
        // System.out.println("Prime Number");
        // }else{
        // System.out.println("Not a prime number");
        // }
        // }
        int Palindrom = number(102);
        if(Palindrom == number(Palindrom)){
            System.out.println("Palindrem number");
        }else{
            System.out.println("Not a plaidrem number");
        }

    }

    public static int number(int n) {

        while (n != 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;

        }
        return 0;

    }

}
