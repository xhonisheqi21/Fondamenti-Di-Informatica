import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // ciclare un'array senza aver bisogno di indici  e trovare media , somma , max e min
        int[] numbers = {1, 2, 3, 4, 5};
        int somma = 0;
        double media = 0.0;
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            somma+= number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.println(number);
        }

        media = (double) somma / numbers.length;
        System.out.println("Media: " + media);
        System.out.println("Massimo: " + max);
        System.out.println("Minimo: " + min);   

        // ciclare un'array con indici per trovare il quadrato degli indici
        for (int i = 0; i < numbers.length; i++) {
            int square = i*i;
            System.out.println("Quadrato dell'indice " + i + " è: " + square);
        }

        // ricerca lineare di un elemento in un array
        int pos = 0;
        int target = 3;
        boolean found = false;
        while (pos < numbers.length && !found) {
            if (numbers[pos] == target) {
                found = true;
                System.out.println("Elemento trovato in posizione: " + pos);
            } else {
                pos++;
            }
        }
        // copiare un array
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        
        // stampare l'array copiato con il metodo .toString()
        System.out.println("Array copiato: " + Arrays.toString(copy));

        // ordinare un array con il metodo .sort()
        int[] unsorted = {5, 3, 1, 4, 2};   
        System.out.println("Array non ordinato: " + Arrays.toString(unsorted));
        Arrays.sort(unsorted);
        System.out.println("Array ordinato: " + Arrays.toString(unsorted));


        // verificare se due array sono uguali con il metodo .equals()
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Gli array sono uguali? " + areEqual);

        // cercare un char in un array con il metodo .binarySearch()
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        char targetChar = 'c';
        int index = Arrays.binarySearch(chars, targetChar);
        if (index >= 0) {
            System.out.println("Carattere trovato in posizione: " + index);
        } else {    
            System.out.println("Carattere non trovato");
        }   
        // riempire un array con il metodo .fill()

        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 2,filledArray.length,1234); // array che devo avere , la pos , la lunghezza e il valore da riempire
        System.out.println("Array riempito: " + Arrays.toString(filledArray));

        // array multidimensionale
        final int COUNTRIES = 8;
        final int MEDALS = 3;
        // int[][] counts = new int[COUNTRIES][MEDALS]; // 8 righe e 3 colonne
        int [][] counts = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18},
            {19, 20, 21},
            {22, 23, 24}
        };
        // counts[column][row] = valore; // per assegnare un valore a una cella specifica o per stamparla
        // come stampare un array multidimensionale con un ciclo for annidato
        for (int i = 0; i < COUNTRIES; i++) {
            for (int j = 0; j < MEDALS; j++) {
                System.out.print(counts[i][j] + " ");
            }
            System.out.println(); // Vai a capo dopo ogni riga
        }

        
        
    }
}
