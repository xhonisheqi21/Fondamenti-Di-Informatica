public class EsercizioDue {
    static int search(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return  i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] myArr = {1,9,8,7,5,6,9,2,3};
        int len = myArr.length;
        int position = search(myArr, len, 9);

        if (position == -1){
            System.out.println("Il valore cercato non si trova all'interno dell'array.");
        }
        else {
            System.out.println("Il valore cercato si trova alla posizone : " + position);
        }
    }
} 