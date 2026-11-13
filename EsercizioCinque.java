import java.util.Arrays;

public class EsercizioCinque {
    int binarySearch(int[] arr, int left , int right , int valoreDaCercare) {
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

    
}
