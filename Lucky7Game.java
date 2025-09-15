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

        //Main game loop
        while (money > 0){
            money==;
            int sevens = 0;

            System.out.println("Drawing 3 numbers...");

            for (int i = 0; i < 3; i++) {
                int number = random.nextInt(10) + 1; //For loop to get 3 random numbers from 1 - 10
                System.out.println(number);
                if (number == luckyNumber) {
                    sevens++;
                }
            }

            //Counting the winnings
            if (sevens == 3) {
                money += 10;
                System.out.println("Three 7s! Jackpot! You win 10€");
            } else if (sevens == 2) {
                money += 5;
                System.out.println("Two 7s! You win 5€");
            } else if (sevens == 1) {
                money += 3;
                System.out.println("One 7! You win 3€");
            } else {
                System.out.println("You lost");
            }

            //if users money is 0 then the game ends
            if (money <= 0) {
                System.out.println("Thanks for playing");
                break;
            }

            System.out.println("You now have " + money + "€");
            System.out.println("Do you want to play again? Y/N");
            String again = in.nextLine();

            if (!again.equalsIgnoreCase("Y")) {
                System.out.println("Thanks for playing");
                break;
            }
        }

        in.close();
    }

        }
    }
}
