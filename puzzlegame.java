import java.util.*;
public class puzzlegame {

    public static void game() {
        System.out.println("Welcome to Puzzle game..");
        System.out.println("Choose one out of 3 \n 1 for STONE \n 2 for PAPER \n 3 for SISEOR");
        Scanner sc = new Scanner(System.in);
        System.out.println("............Choose................");
        int choose = sc.nextInt();
        Random random =  new Random(1);
      System.out.println(random);

        
        System.out.println("Your choose option is " + choose);

    }

    public static void main(String[] args) {
        game();

    }

}
