public class EsercizioUno {
    public static void main(String[] args) {
        int[] values = {1,-89,0,897,4,-569,489,63,-14};
        int sum = 0;
        double avg = 0;
        int arrLenght = values.length;

        for (int value : values) {
            sum+=value;
        }
        avg = (double) sum / arrLenght;
        System.out.println("La media è : " + (avg));
    }
}