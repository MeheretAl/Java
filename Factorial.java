import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to find the factorial of?");
        num = input.nextInt();
        System.out.println(factorial(num));
        input.close();

    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}
