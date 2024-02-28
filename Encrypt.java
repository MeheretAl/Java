/*
     * Your application should read a four-digit
     * integer entered by the user and encrypt it as follows: Replace each digit
     * with the result of adding 7
     * to the digit and getting the remainder after dividing the new value by 10.
     * Then swap the first digit
     * with the third, and swap the second digit with the fourth. Then print the
     * encrypted integer. Write
     * a separate application that inputs an encrypted four-digit integer and
     * decrypts it (by reversing the
     * encryption scheme) to form the original number.
     */

import java.util.Scanner;

public class Encrypt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number you want to encrypt: ");
        int number = input.nextInt();
        int answer = swap(getDigits(number));
        System.out.printf("This is the encrypted number: %d.", answer);
        input.close();
    }

    public static int swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
        int result = 0;
        for (int i : arr) {
            result = result * 10 + i;
        }
        return result;

    }

    public static int[] getDigits(int num) {
        int numsize = String.valueOf(num).length();
        int[] arr = new int[numsize];

        for (int i = 0; i < numsize; i++) {
            int digit = num % 10;
            arr[numsize - i - 1] = (digit + 7) % 10;
            num = num / 10;
        }

        return arr;
    }

}
