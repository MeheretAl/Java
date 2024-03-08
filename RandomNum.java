import java.util.Random;
import java.util.Scanner;

public class RandomNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(101);
        int tries = 10;
        while (tries > -1) {
            
            System.out.print("Input your guess: ");
            int guess = input.nextInt();
            if (guess == randomNum && tries != 0) {
                System.out.printf("You guessed correctly with %d tries left.%n", tries);
                break;
            } else if (tries == 0 && guess == randomNum) {
                System.out.println("You guessed correctly on your last try.");
                break;
            } else if (guess > randomNum) {
                System.out.printf("Guess lower. You now have %d tries left%n", tries);
            } else if (guess < randomNum) {
                System.out.printf("Guess higher. You now have %d tries left.%n", tries);
            }

            tries -= 1;
        }

        input.close();

    }

}
