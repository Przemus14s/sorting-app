package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Tablica po sortowaniu");
        int dlugosc = 10;
        double[] table;
        table = new double[dlugosc];
        for (int i = 0; i < dlugosc; i++) {
            table[i] = ((double) (int) (Math.random() * 1000 / 100));
            System.out.printf(table[i] + ", ");

        }
        System.out.println();
        insertionSort(table);
    }

    public static void insertionSort(double[] doubleArray) {
        double temp;
        int n = doubleArray.length;
        for (int i = 1; i < n; i++) {
            temp = doubleArray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (doubleArray[j] > temp) {
                    doubleArray[j + 1] = doubleArray[j];
                    doubleArray[j] = temp;

                }
            }
        }
        System.out.println("Tablica po sortowaniu");
        for (double v : doubleArray) {
            System.out.printf(v + ", ");
        }
    }
}
