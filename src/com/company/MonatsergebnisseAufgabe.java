package com.company;

import java.util.Arrays;


public class MonatsergebnisseAufgabe {

    public static final int[] businessResult = {-1, 10, 2, 5, -4, -3, -2, -1};
    public static void main(String[] args) {

        //1. Gesamtergebnis

        int summe = 0;
        for (int i = 0; i < businessResult.length; i++) {
            summe += businessResult[i];
        }
        System.out.println(summe);
    }

    //2. das beste Monatsergebnis?
    public static void bestMonth(int[] businessResult) {
        int bestMonth = 0;
        int idxBestMonth = 0;
        for (int i = 0; i < businessResult.length; i++) {
            if (bestMonth < businessResult[i]) {
                bestMonth = businessResult[i];
                idxBestMonth = i;
            }
            System.out.println("Best Monats result is " + bestMonth);
        }
        System.out.println("the best Month is : " + idxBestMonth);
    }

    //3. das schächste Monat?
    public static void worstMonth(int[] businessResult) {
        int worstMonth = 0;
        int idxWorstMonth = 0;
        for (int i = 0; i < businessResult.length; i++) {
            if (worstMonth > businessResult[i]) {
                worstMonth = businessResult[i];
                idxWorstMonth = i;
            }
            System.out.println(worstMonth);
        }
        System.out.println("das schächste Monat ist :" + idxWorstMonth);
    }

    // 4. zwei hintereinander negativen Ergebnis?
    public static void zweiMonatHinterEinanderNegative(int[] businessResult) {
        boolean hasNegativResults = false;
        for (int i = 0; i < businessResult.length - 2; i++) {
            if (businessResult[i] < 0 && businessResult[i + 1] < 0 && businessResult[i + 2] < 0) {
                hasNegativResults = true;
                break;
            }
            if (hasNegativResults) {
                System.out.println("ja, es gibt zwei Monate mit neg.Ergebnis nacheinander.");
            } else {
                System.out.println("Nein, es gibt keine zwei Monate mit neg. Ergebnis nacheinander.");
            }
        }
    }
    // 5. zweibeste Ergebnis?
    public static void zweiBesteErgebnis(int[] businessResult){

        int maxValue = 0;
        int secondMaxValue = 0;
        int idx ;
        int[] list = Arrays.copyOf(businessResult,businessResult.length);
        int[] sortedList = list;
        boolean swapped = true;
        while(true){
            swapped = false;
            for (int i = 0; i <businessResult.length-1 ; i++) {
                if(list[i].compareTo(list[i+1])>0) {
                    swapped = true;
                    int tempInt = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = tempInt;
                }
            }
            System.out.println(sortedList);
            System.out.println(sortedList[1]);
        }

    }
}
