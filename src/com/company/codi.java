package com.company;

import java.util.Scanner;

public class codi {

    private static Scanner in = new Scanner(System.in);

    public static String textNou (String text){

        System.out.print("Escriu el nou text: ");
        String nouText = in.nextLine();

        return nouText;
    }
    public static String nLletres (String text){

        String[] arrayText = text.split(" ");

        int numLletres = 0;

        for (int i = 0; i < arrayText.length; i++) {

            for (int j = 0; j < arrayText[i].length(); j++) {

                numLletres++;
            }
        }
        return "Hi ha " + numLletres + " lletres";
    }
    public static String nParaules (String text){

        String[] arrayText = text.split(" ");

        int numParaules = 0;

        for (int i = 0; i < arrayText.length; i++) {

                numParaules++;
        }
        return "Hi ha " + numParaules + " paraules";
    }
    public static void repeticionsCaracters (String text){


        text = text.replaceAll("  ", " ");
        text = text.replaceAll(",", ", ");
        text = text.replaceAll(".", ". ");

        String[] arrayText = text.split(" ");

        char[] caracters =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
                't','u','v','w','x','y','z','.',',','?','!',':'};

        int[] numRepeticions = new int[caracters.length];

        for (int i = 0; i < arrayText.length ; i++) {

            for (int j = 0; j < arrayText[i].length(); j++) {

                for (int k = 0; k < caracters.length; k++) {

                    if(arrayText[i].charAt(j) == caracters[k]){

                        numRepeticions[k] += 1;
                    }
                }
            }
        }
        for (int i = 0; i < caracters.length; i++) {

            if (numRepeticions[i] >= 1){

                System.out.println("Els caracter que es repeteix es: " + caracters[i] +" amb "
                        + numRepeticions[i] + " repeticions");
            }
        }
    }
    public static String caracterINumrepeticions(String text){

        String[] arrayText = text.split(" ");

        char[] caracters =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
                't','u','v','w','x','y','z','.',',','?','!',':'};

        int[] repeticions = new int[caracters.length];

        int index = 0;

        for (int i = 0; i < arrayText.length; i++) {

            for (int j = 0; j < arrayText[i].length(); j++) {

                for (int k = 0; k < caracters.length; k++) {

                    if(arrayText[i].charAt(j) == caracters[k]){

                        repeticions[k] += 1;
                    }
                }
            }
        }
        for (int i = 0; i < repeticions.length; i++) {

            if (repeticions[i] > repeticions[index]){

                index = i;

            }
        }
        return "El caracter m??s repetit ??s: " + caracters[index] + " amb " + repeticions[index] + " repeticions";
    }
    public static String paraulaINumRepeticions( String text){

        String[] arrayText = text.split(" ");

        int [] repeticions = new int[arrayText.length];

        int index = 0;

        for (int i = 0; i < arrayText.length; i++) {

            for (int j = 0; j < arrayText.length; j++) {

                if(arrayText[i].equalsIgnoreCase(arrayText[j])){

                    repeticions[i] += 1;
                }
            }
        }
        for (int i = 0; i < repeticions.length; i++) {

            if(repeticions[i] > repeticions[index]){

                index = i;
            }
        }
        if (repeticions[index] == 1){

            return "No hi ha cap paraula repetida";
        }
        return "La paraula m??s repetida ??s: " + arrayText[index] + " amb " + repeticions[index] + " repeticions";
    }
    public static String numCaracter(String text, char vocal){

        String[] arrayText = text.split(" ");

        int repeticions = 0;

        for (int i = 0; i < arrayText.length; i++) {

            for (int j = 0; j < arrayText[i].length(); j++) {

                if( arrayText[i].charAt(j) == vocal){

                    repeticions++;
                }
            }
        }
        return "El caracter " + vocal + " es repeteix " + repeticions + " vegades";
    }
    public static String numParaula(String text, String paraula){

        String[] arrayText = text.split(" ");

        int repeticions = 0;

        for (int i = 0; i < arrayText.length; i++) {

            if(arrayText[i].equalsIgnoreCase(paraula)){

                repeticions++;
            }
        }
        return "La paraula " + paraula + " es repeteix " + repeticions + " vegades";
    }


}
