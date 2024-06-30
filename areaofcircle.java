import java.util.*;
public class areaofcircle {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of radius :");
    float r = sc.nextFloat();

    float areaofcircle = (float) (3.14*r*r);
    System.out.println("The Area of Circle is "+ areaofcircle);
    
}
    
}