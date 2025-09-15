import java.util.Random;
import java.util.Scanner;

public class Lucky7Game{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int luckyNumber = 7;

        //Game title
        System.out.println("            *****************   ");
        System.out.println("            Welcome to Lucky7   ");
        System.out.println("            *****************   ");

        // Ask how much money the user will use
        System.out.print("\nHow much money do you want to start with? ");
        int money = in.nextInt();
        in.nextLine();

        System.out.println("Game starting with " + money + "€\n");
    }
}
