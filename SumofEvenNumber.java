import java.util.Scanner;

public class SumofEvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array Size ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int evenSum = 0;
        System.out.println("Input number in an Array");
        for (int iterator = 0; iterator < arraySize; iterator++) {
            array[iterator] = scanner.nextInt();
        }

        for (int iterator = 0; iterator < arraySize; iterator++) {
            if (array[iterator] % 2 != 0) continue;
            evenSum += array[iterator];

        }
    }
}
