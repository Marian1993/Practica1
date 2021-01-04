package com.company;

import java.util.Scanner;

public class codi {

    private static Scanner in = new Scanner(System.in);

    public static String textNou (String text){

        String nouText = in.nextLine();

        return nouText;
    }
    public static int nLletres (String text){

        String[] arrayText = text.split(" ");

        int numLletres = 0;

        for (int i = 0; i < arrayText.length; i++) {

            for (int j = 0; j < arrayText[i].length(); j++) {

                numLletres++;
            }
        }
        return numLletres;
    }
    public static int nParaules (String text){

        String[] arrayText = text.split(" ");

        int numParaules = 0;

        for (int i = 0; i < arrayText.length; i++) {

                numParaules++;
        }
        return numParaules;
    }
    public static int[] repeticionsCaracters (String text){

        String[] arrayText = text.split(" ");

        char[] caracters =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
                't','u','v','w','x','y','z','.',',','?','!',':'};
        
        int[] numRepeticions = new int[caracters.length];

        for (int i = 0; i < arrayText.length ; i++) {

            for (int j = 0; j < arrayText[i].length(); j++) {

                for (int k = 0; k < caracters.length; k++) {

                    if(arrayText[i].charAt(j) == caracters[k]){

                        numRepeticions[k] +=1;
                    }
                }
            }
        }
        for (int i = 0; i < caracters.length; i++) {

            for (int j = 0; j < numRepeticions[i]; j++) {

                if (numRepeticions[j] >= 1){

                    System.out.println();
                }
            }

        }

    }

}
