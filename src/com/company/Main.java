package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        boolean salir = false;
        int opcio;

        System.out.print("Introdueix un text:");
        String text = in.nextLine();

        while(!salir){

            System.out.println();
            System.out.println("--------------------MENÚ--------------------");
            System.out.println("Opcio 1: Introduir un text nou.");
            System.out.println("Opcio 2: Veure el text actual.");
            System.out.println("Opcio 3: Comptar el número de lletres.");
            System.out.println("Opcio 4: Comptar el número de paraules.");
            System.out.println("Opcio 5: Número d'aparicions de cada caràcter.");
            System.out.println("Opcio 6: Dir el caràcter més repetit i el número d'aparicions.");
            System.out.println("Opcio 7: Dir la paraula més repetida i el número d'aparicions.");
            System.out.println("Opcio 8: Introduir per teclat un caracter i dir quantes vegades apareix.");
            System.out.println("Opcio 9: Introduir per teclat una paraula i dir quantes vegades apareix.");
            System.out.println("Opcio 10: Sortir");
            System.out.println("--------------------------------------------");
            System.out.println();


            try {
                System.out.print("Quina opcio vol elegir:");
                opcio = in.nextInt();

                switch (opcio) {

                    case 1:
                        System.out.print("Escriu el nou text: ");
                        System.out.println(text = codi.textNou(text));
                        break;
                    case 2:
                        System.out.println("Text introduït: "+ text);
                        break;
                    case 3:
                        System.out.println("Numero de lletres: " + codi.nLletres(text));
                        break;
                    case 4:
                        System.out.println("Numero de paraules: " + codi.nParaules(text));
                        break;
                    case 5:
                        codi.repeticionsCaracters(text);

                        break;
                    case 6:
                        System.out.println();

                        break;
                    case 7:
                        System.out.println();

                        break;
                    case 8:
                        System.out.println();

                        break;
                    case 9:
                        System.out.println();

                        break;
                    case 10:
                        salir = true;
                        break;
                    default:
                        System.out.println("Aquesta opció no surt en el menú.");

                }
            }catch(InputMismatchException e){

                System.out.println("Tienes que poner un número.");
                opcio=in.nextInt();
            }
        }
        System.out.println("Fin del menú");
    }
}
