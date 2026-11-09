import java.util.Scanner;

public class GestoreVoti {
    public static void main(String[] args) {
        /**
         * Inizializziamo lo scanner
         */
        Scanner input = new Scanner(System.in);
        /** 
         * Scelta del numero di voti a giudizio
         */
        System.out.print("Quanti Voti Vuoi Inserire : ");
        int numeroDiVoti = input.nextInt();
        if (numeroDiVoti <= 0) {
            System.out.println("Devi inserire almeno un voto.");
            return;
        }

        /** 
         * Inizializzazione array 
         */
        double[] votiStudente = new double[numeroDiVoti];
        for (int i = 0; i < numeroDiVoti; i++) {
            System.out.print("Inserire il voto n." + (i+1) + " ");
            votiStudente[i] = input.nextDouble();
            if (votiStudente[i] <= 0) {
                System.out.println("Devi Inserire un voto da 1 a 10");
                return;
            } 
            if (votiStudente[i] > 10) {
                System.out.println("Devi Inserire un voto da 1 a 10");
                return;
            } 
        }

        double votoMax = votiStudente[0];
        double votoMin = votiStudente[0];
        double sommaVoti = 0;
        double mediaVoti = 0;
        int contatoreSufficienze = 0;


        for (int i = 0; i < votiStudente.length; i++) {
            sommaVoti+= votiStudente[i];
            if (votiStudente[i] > votoMax) {
                votoMax = votiStudente[i];
            }
            if (votiStudente[i] < votoMin) {
                votoMin = votiStudente[i];
            }
            if (votiStudente[i] >= 6) {
                contatoreSufficienze++;
            }
        }
        mediaVoti = sommaVoti / numeroDiVoti;
        System.out.println("La media dei voti è : " + mediaVoti);
        System.out.println("Il voto più alto è : " + votoMax);
        System.out.println("Il voto più basso è : " + votoMin);
        System.out.println("Il numero di sufficienze è : " + contatoreSufficienze);

        input.close();

    }
}