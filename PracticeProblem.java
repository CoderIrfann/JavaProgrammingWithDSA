// // Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.
// // (Hint : Average of N numbers is sum of those numbers divided by N)

// import java.util.Scanner;

// public class PracticeProblem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter the first number :");
//         // int num1 = sc.nextInt();
//         // System.out.print("Enter the second number :");
//         // int num2 = sc.nextInt();
//         // System.out.print("Enter the third number :");
//         // int num3 = sc.nextInt();

//         // int avg = (num1 + num2 + num3) / 3;

//         // System.out.println("The Avg of " + num1 + " and " + num2 + " or " + num3 + "
//         // is :" + avg);

//         // Question2:Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.(Hint
//         // : area of a square is (side x side))
//         // System.out.print("Enter the side of square :");
//         // int side = sc.nextInt();
//         // int AreaOfSquare = side * side;
//         // System.out.println("The Area of Square is :" + AreaOfSquare);

//         // System.out.print("Enter the value of pencil :");
//         // float pencil = sc.nextFloat();
//         // System.out.print("Enter the value of pen :");
//         // float pen = sc.nextFloat();
//         // System.out.print("Ener the value of eraser :");
//         // float eraser = sc.nextFloat();

//         // double totalCost = pen+pencil+eraser;
//         // double gst = 0.18;
//         // double totalcostWithGST = totalCost *(1+gst);
//         // System.out.println("The Total Cost with GST of the material is "+
//         // totalcostWithGST);

//         // int exp1 = (x*(y/x));
//         // System.out.println(exp1);

//         // int x, y, z;
//         // x = y = z = 2;
//         // x +=y;
//         // y -=z;
//         // // x += y;
//         // y -= z;
//         // z /= (x + y);
//         // System.out.println(z);
//         // int x = 9, y = 12;
//         // int a = 2, b = 4, c = 6;
//         // int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b *
//         // y);
//         // System.out.println(exp);
//         // int a = 3;
//         // int b = a+1;
//         // System.out.println(b);
//         // System.out.println(x + " " + y + " " + z);

//         // Scanner sc = new Scanner(System.in);
//         // int a = sc.nextInt();
//         // System.out.println(a);

//         // double temp = 103.4;
//         // if(temp>100){
//         // System.out.println("You have a fever");
//         // }else{
//         // System.out.println("You don't have fever");
//         // }

//         System.out.println("Choise you number");
//         int number = sc.nextInt();
//         switch (number) {
//             case 1:
//                 System.out.println("Monday");

//                 break;
//             case 2:
//                 System.out.println("Tuesday");

//                 break;
//             case 3:
//                 System.out.println("Wednessday");

//                 break;
//             case 4:
//                 System.out.println("Thursday");

//                 break;

//             case 5:
//                 System.out.println("Friday");

//                 break;
//             case 6:
//                 System.out.println("Saturday");

//                 break;

//             case 7:
//                 System.out.println("Sunday");

//                 break;

//             default:
//                 System.out.println("You choise wrong number");
//                 break;
//         }

//     }
// }

import java.util.Scanner;

import javax.crypto.spec.DESKeySpec;

/**
 * PracticeProblem
 */
public class PracticeProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
