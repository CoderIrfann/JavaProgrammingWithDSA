import java.util.Scanner;

public class javaQuestion {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in) ;
    // System.out.print("Enter the value");
    // int number = sc.nextInt();

    // if(number %2 == 0){
    // System.out.println("Even number");
    // }else{
    // System.out.println("Odd Number");
    // }

    // Question 2
    // byte A = 2;// Int byte short int == int;
    // A = (byte) (A * 2);//int *2;
    // System.out.println(A);

    // Question 3
    // int number = 1;
    // number = number+1;
    // System.out.println(number);

    // // Question 4
    // int a = 3; // a variable ke ander 3 ko dala;
    // int b = a++; // B ke ander input a--; =3; a =4 b =3
    // System.out.println(a);
    // System.out.println(b);

    // char Char = 'A';
    // if(Char >= 'a' && Char <= 'z'){
    // System.out.println("LowerCase");
    // }else{
    // System.out.println("UpperCase");
    // }

    // int number1;
    // int number =2;

    // for(int i = 1;i<5; i++){
    // for(int j = 1; j<5; j++){
    // System.out.print("*");
    // }
    // System.out.println("");

    // }

    // do {
    // Scanner sc = new Scanner(System.in);
    // int number =sc.nextInt();
    // if(number%10 == 0){
    // System.out.println("Samapt");
    // continue;
    // }
    // System.out.println(number);

    // } while (true);

    // // Question Find prime number
    // Scanner sc = new Scanner(System.in);
    // int input = sc.nextInt();
    // if (input == 2) {
    //   System.out.println("Prime Number");
    // } else {
    //   boolean isPrime = true;

    //   for (int i = 2; i <= input - 1; i++) {
    //     if (input % i == 0) {
    //       isPrime = false;
    //     }
    //   }
    //   if (isPrime == true) {
    //     System.out.println("Prime Number");
    //   } else {
    //     System.out.println("Not a prime number");
    //   }

    // }
    System.out.println(binomial(5 , 2));

  }

  public static int factorialOfN(int a){
    for(int i = 0; i<=a; i++){
      a *=i;
    }
    return 0;
  }



  public static int binomial(int a, int f ){
    int n = factorialOfN(a);
    int r = factorialOfN(f);
    int minus = factorialOfN(n-r);

    int c = r*minus;

    int binomialCofficient = r/(r*minus);
    return binomialCofficient;
  

  }

}
