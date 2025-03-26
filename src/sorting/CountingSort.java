package sorting;

import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj najwieksza wartosc");
        int max = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ile liczb bedzie mial ciag?");
        int size = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Podaj liczby do sortowania");
        int[] numberArray = new int[size];
        for (int i = 0; i < size; i++) {
            numberArray[i] = readNumber(max);
        }
        System.out.println();
        countingSortArray(numberArray, max);

        System.out.println("Tablica posortowana");
        for (int element : numberArray) System.out.print(element + " ");
    }
    public static int readNumber(int max) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number <= max) return number;
        else {
            System.out.printf("Wprowadz liczbę nie większą niż %d\n", max);
            return readNumber(max);
        }
    }

    public static void countingSortArray(int[] numberArray, int max) {
        int[] temp = new int[max + 1];
        int size = numberArray.length;
        for (int i = 0; i < max; i++) temp[i] = 0;
        for (int i = 0; i < size; i++) temp[numberArray[i]]++;
        int k = 0;
        for (int i = 0; i < max + 1; i++) {
            for (int j = temp[i]; j >= 1; j--) {
                numberArray[k] = i;
                k++;
            }
        }
    }
}
