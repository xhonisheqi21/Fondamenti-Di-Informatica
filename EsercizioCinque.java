import java.util.Arrays;

public class EsercizioCinque {
    static int binarySearch(int[] arr, int left , int right , int valoreDaCercare) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == valoreDaCercare) {
                return mid;
            }else if (arr[mid] > valoreDaCercare) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] myArr = {1,56,8,7,10,101,-25,65,89,-4};
        System.out.println("Il mio array : " + Arrays.toString(myArr));
        Arrays.sort(myArr);
        System.out.println("Il mio array ordinato : " + Arrays.toString(myArr));
        int len = myArr.length;
        int valoreDaCercare = 65;
        int pos = binarySearch(myArr, 0 , (len-1),valoreDaCercare );
        if (pos == -1) {
            System.out.println("Valore non trovato");
        }
        else {
            System.out.println("Valore trovato alla posizione : " + pos);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo impiegato in ms : " + (endTime - startTime));
    }
}
