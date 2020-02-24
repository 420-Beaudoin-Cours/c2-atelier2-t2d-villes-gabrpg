package com.company;

import java.text.DecimalFormat;

public class villes {

    public static void afficherTab(int[][] tab){
        int nbColonnes = 0;
        do {
            for (int i = 0; i < tab[0].length; i++) {
                System.out.print(tab[nbColonnes][i] + " ");
            }
            System.out.println();
            nbColonnes++;
        } while (nbColonnes < tab.length);
    }

    public static void sommeUneLigne (int[][] tab){

        int nbColonnes = 0;

        do {
            int total = 0;

            for (int i = 0; i < tab[0].length; i++) {
                total = total + tab[nbColonnes][i];
            }
            nbColonnes++;

            if (nbColonnes == 1) {
                System.out.println("Québec: " + total);
            } else if (nbColonnes == 2) {
                System.out.println("Toronto: " + total);
            } else if (nbColonnes == 3) {
                System.out.println("Joliette: " + total);
            } else {
                System.out.println("Gaspé: " + total);
            }
        } while (nbColonnes < tab.length);
    }

    public static double moyenneUneLigne(int[][] tab){

        DecimalFormat df = new DecimalFormat("0.0");

        int nbColonnes = 0;
        double moyenne = 0;
        double somme = 0;

        do {
            somme = somme + tab[nbColonnes][1];
            nbColonnes++;
        }while (nbColonnes < 4);
        moyenne = somme /nbColonnes;
        return moyenne;
    }

    public static void moyenneUneCol(int[][] tab){

        DecimalFormat df = new DecimalFormat("0.00");

        int nbColonnes = 0;
        double moyenne = 0;
        double somme = 0;

        do {
            for (int i = 0; i < tab[0].length; i++) {
                somme = somme + tab[nbColonnes][i];
            }
            moyenne = somme / tab[0].length;
            nbColonnes++;

            somme = 0;

            if (nbColonnes == 1) {
                System.out.println("Québec " + df.format(moyenne));
            } else if (nbColonnes == 2) {
                System.out.println("Toronto " + df.format(moyenne));
            } else if (nbColonnes == 3) {
                System.out.println("Joliette " + df.format(moyenne));
            } else {
                System.out.println("Gaspé " + df.format(moyenne));
            }
        }while (nbColonnes < tab.length);
    }

    public static void maxLigne(int [][] tab){

        int nbColonnes = 0;
        int max = tab[nbColonnes][0];

        do {
            for (int i = 0; i < tab[0].length; i++){
                if (tab[nbColonnes][i] > max){
                    max = tab[nbColonnes][i];
                }
            }
            nbColonnes++;
            if (nbColonnes == 1) {
                System.out.println("Québec " + max);
                max = tab[nbColonnes][0];
            } else if (nbColonnes == 2) {
                System.out.println("Toronto " + max);
                max = tab[nbColonnes][0];
            } else if (nbColonnes == 3) {
                System.out.println("Joliette " + max);
                max = tab[nbColonnes][0];
            } else {
                System.out.println("Gaspé " + max);
            }

        }while (nbColonnes < tab.length);
    }

    public static void minLigne(int[][] tab){
        int nbColonnes = 0;
        int min = tab[nbColonnes][0];

        do {
            for (int i = 0; i < tab[0].length; i++){
                if (tab[nbColonnes][i] < min){
                    min = tab[nbColonnes][i];
                }
            }
            nbColonnes++;
            if (nbColonnes == 1) {
                System.out.println("Québec " + min);
                min = tab[nbColonnes][0];
            } else if (nbColonnes == 2) {
                System.out.println("Toronto " + min);
                min = tab[nbColonnes][0];
            } else if (nbColonnes == 3) {
                System.out.println("Joliette " + min);
                min = tab[nbColonnes][0];
            } else {
                System.out.println("Gaspé " + min);
            }

        }while (nbColonnes < tab.length);
    }
}
