package MainApp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Object> echipamente = new ArrayList<>();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMeniu:");
            System.out.println("1. Afisare toate echipamentele");
            System.out.println("2. Afisare imprimante");
            System.out.println("3. Afisare copiatoare");
            System.out.println("4. Afisare sisteme de calcul");
            System.out.println("5. Modificare starea unui echipament");
            System.out.println("6. Setare mod de scriere pentru o imprimanta");
            System.out.println("7. Setare format de copiere pentru copiatoare");
            System.out.println("8. Instalare sistem de operare pe un sistem de calcul");
            System.out.println("9. Afisare echipamente vandute");
            System.out.println("10. Ieșire");

            System.out.print("Alegeti o optiune: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:



                    break;
                case 2:
                    System.out.println("Introduceti detaliile noii imprimante:");

                    System.out.print("Pagini pe minut: ");
                    int ppm = scanner.nextInt();

                    System.out.print("Rezolutie : ");
                    int dpi = scanner.nextInt();

                    System.out.print("Pagini per cartus: ");
                    int pCar = scanner.nextInt();

                    System.out.print("Mod de tiparire (Color sau Alb-negru): ");
                    String modTiparire = scanner.next();

                    Imprimante imprimantaNoua = new Imprimante(ppm, dpi, pCar, modTiparire);
                    echipamente.add(imprimantaNoua);
                    imprimantaNoua.afisareImprimanta();

                    break;
                case 3:
                    System.out.println("Introcueti detaliile noii copiatoare");

                    System.out.print("Pagini pe toner: ");
                    int p_ton=scanner.nextInt();

                    System.out.print("Format copiere: ");
                    String formatCopiere = scanner.next();

                    Copiatoare copiatorNou = new Copiatoare(p_ton,formatCopiere);
                    echipamente.add(copiatorNou);
                    copiatorNou.afisareCopiatoare();

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:
                    System.out.println("Programul s-a încheiat.");
                    break;
                default:
                    System.out.println("Opțiune invalidă. Vă rugăm să alegeți din nou.");
            }
        } while (option != 10);
    }
}
