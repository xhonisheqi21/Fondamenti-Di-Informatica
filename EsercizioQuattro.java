import java.util.Arrays;

public class EsercizioQuattro {
    private static int min;
    private static int max;
    private static final int SIZE = 10000;
    public static void main(String[] args) {
        int[] myArr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            myArr[i] = (int) (Math.random() * SIZE) + 1;
        }

        System.out.println(metodo1(myArr));
        System.out.println(metodo2(myArr));
    }
    static String metodo1(int[] temp) {
        long timeStart = System.currentTimeMillis();
        min = max = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
            if (temp[i] < min) {
                min = temp[i];
            }
        }
        long timeEnd = System.currentTimeMillis();
        return "Il tempo di esecuzione è stato di : " + (timeEnd-timeStart) + " " + "il minimo dell'array è : " + min + " " + "il massimo dell'array è " + max;
    }
    static String metodo2(int[] arr) {
        // long timeStart = System.currentTimeMillis();
        long timeStart = System.currentTimeMillis();
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length - 1];
        long timeEnd = System.currentTimeMillis();
        return "Il tempo di esecuzione è stato di : " + (timeEnd-timeStart) + " " + "il minimo dell'array è : " + min + " " + "il massimo dell'array è " + max;
    }
}
