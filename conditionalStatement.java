import java.util.Scanner;

public class conditionalStatement {
  /**
   * @param args
   */
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int number = sc.nextInt();
    // int number2 = sc.nextInt();
    // if (number > number2) {
    // System.out.println("The greater number is " + number);
    // } else {
    // System.out.println("The greater number is " + number2);
    // }

    // int num = 1;
    // num += num;
    // System.out.println(num);

    // int score = 3;
    // if(score >3){
    // System.out.println("You are closed to winner...!");
    // }else if(score >3 && score<=5){
    // System.out.println("Winning zone");
    // }else{
    // System.out.println("Better luck next time.......!");
    // }

    // int A =1; int B = 3; int C = 6;
    // if(A> B && A>C){
    // System.out.println("Greater number is"+ A);
    // }else if(B>C){
    // System.out.println("B IS greater then A and C");
    // }else{
    // System.out.println("C is greater then A");
    // }

    // int number = 4;
    // String a = ((number%2) == 0)? "Even" : "odd";
    // System.out.println(a);2
    // int marks = 22;
    // String result = (marks < 33)?"Pass" : "fail";
    // System.out.println(result);
    // double income = 2500000;
    // if(income < 2500000){
    // double tax = income *0.08;
    // System.out.println(tax);
    // }else if(income > 2500000){
    // double tax = income *0.16;
    // System.out.println(tax);
    // }else{
    // double tax = income *0.8;
    // System.out.println(tax);

    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter any number :");

    // int num = sc.nextInt();
    // if (num % 2 == 0) {
    // System.out.println("This number is even :" + num);
    // } else {
    // System.out.println("Odd number :" + num);
    // }

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int number2 = sc.nextInt();
    char operator = sc.next().charAt(0);
    switch (operator) {
   
      case '+':
        System.out.println(number + number2);

        break;
      case '+':
        System.out.println(number + number2);

        break;

      default:
        break;
    }

  }

}
