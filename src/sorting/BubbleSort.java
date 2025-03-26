package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int sizeArray = sizeTab();
        System.out.println("Tablica przed sortowaniem: " + Arrays.toString(fillArray(sizeArray)));
        System.out.println("Tablica po sortowaniu: " + Arrays.toString(bubbleSort(fillArray(sizeArray))));

    }
    public static int sizeTab(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres tablicy: ");
        int sizeTab = scanner.nextInt();
        return sizeTab;
    }

    public static double[] fillArray(int sizeTab){
        int sizeArray = sizeTab;
        double[] array = new double[sizeArray];
        int lowerNumber = 30;
        int upperNumber = 70;
        for(int i = 0; i < sizeTab; i++){
            array[i] = lowerNumber + (int)(Math.random() * ((upperNumber - lowerNumber) + 1 ));
        }
        return array;
    }


    public static double[] bubbleSort(double[] arrayNumber){
        double temp;
        int sizeArray = arrayNumber.length;
        for(int j = sizeArray - 1; j >= 0; j--){
            for(int i = 0; i < j; i++){
                if(arrayNumber[i]  > arrayNumber[i+1]){
                    temp = arrayNumber[i];
                    arrayNumber[i] = arrayNumber[i+1];
                    arrayNumber[i+1] = temp;
                }
            }
        }
        return arrayNumber;
    }

}
