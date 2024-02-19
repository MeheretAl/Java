import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = input.nextInt();
        while (num > 0) {
            int digit = num % 10;
            System.out.printf("%d ", digit);
            num /= 10;
        }
        // prints in reverse
        // could reverse the num first and make it give me the answer or
        // create an array to store the numbers and start from the end to the front
        // will fix it later on
        input.close();
    }
}
