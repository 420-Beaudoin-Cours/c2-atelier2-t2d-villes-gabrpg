package com.company;

public class villes {

    public static void afficherTab(int[][] tab) {


        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sommeUneLigne(int[][] tab, int iLigne) {

        int somme = 0;

        for (int i = 0; i < tab[0].length; i++) {
            somme += tab[iLigne][i];
        }

        return somme;
    }

    public static double moyenneUneLigne(int[][] tab, int iLigne) {

        double moyenne = 0;
        double somme = 0;

        for (int i = 0; i < tab[0].length; i++){
            somme += tab[iLigne][i];
            moyenne = somme / tab[0].length;
        }
        return moyenne;
    }

    public static double moyenneUneCol(int[][] tab, int iCol) {

        double moyenne = 0;
        double somme = 0;

        for (int i = 0; i < tab.length; i++) {
            somme += tab[i][iCol];
            moyenne = somme / tab.length;
        }
        return moyenne;
    }


    public static int maxLigne(int[][] tab, int iLigne) {

        int max = tab[iLigne][0];

        for (int i = 0; i < tab[0].length; i++) {
            if (tab[iLigne][i] > max)
                max = tab[iLigne][i];
        }
        return max;
    }

    public static int minLigne(int[][] tab, int iLigne) {

        int min = tab[iLigne][0];

        for (int i = 0; i < tab[0].length; i++){
            if (tab[iLigne][i] < min)
                min = tab[iLigne][i];
        }
        return min;
    }
}