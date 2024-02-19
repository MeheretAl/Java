import java.util.Scanner;

public class Sum {

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        int firstNum;
        int secondNum;
        int sum;

        System.out.print("Enter First Num: ");
        firstNum = input.nextInt();
        System.out.print("Enter Second Num: ");
        secondNum = input.nextInt();

        sum = firstNum + secondNum;

        System.out.printf("Sum is %d%n", sum);

        input.close();

    }

}
