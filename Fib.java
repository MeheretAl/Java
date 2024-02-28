import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to find fibonacci series: ");
        int number = input.nextInt();

        System.err.println("The fibbonaci value for " + number + " is " + fibValue(number));
        input.close();

    }

    public static int fibValue(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibValue(number - 1) + fibValue(number - 2);
        }

    }

}
