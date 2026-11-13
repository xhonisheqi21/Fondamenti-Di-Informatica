import java.util.Arrays;
public class EsercizioTre {
    static private int min;
    static private int max;

    public static void main(String[] args) {
        int[] myArr = new int[]{1,5,7,9,35,1,47,168,-258};
        System.out.println(metodo1(myArr));
        System.out.println(metodo2(myArr));
    }
    static String metodo1(int[] temp) {
        long timeStart = System.nanoTime();
        min = max = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
            if (temp[i] < min) {
                min = temp[i];
            }
        }
        long timeEnd = System.nanoTime();
        return "Il tempo di esecuzione è stato di : " + (timeEnd-timeStart) + " " + "il minimo dell'array è : " + min + " " + "il massimo dell'array è " + max;
    }
    static String metodo2(int[] arr) {
        // long timeStart = System.currentTimeMillis();
        long timeStart = System.nanoTime();
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length - 1];
        long timeEnd = System.nanoTime();
        return "Il tempo di esecuzione è stato di : " + (timeEnd-timeStart) + " " + "il minimo dell'array è : " + min + " " + "il massimo dell'array è " + max;
    }
}
