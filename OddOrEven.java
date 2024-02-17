import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.printf("%d is even.", num);
        } else {
            System.out.printf("%d is odd.", num);
        }
        input.close();
    }
}
