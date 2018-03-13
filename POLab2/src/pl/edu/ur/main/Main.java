package pl.edu.ur.main;

import java.util.*;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7

        System.out.println("Podaj nr zadania: ");
        Scanner wczytaj = new Scanner(System.in);
        int wybor = wczytaj.nextInt();

        switch (wybor) {
            case 3:
                float[] tablica = new float[10];

                for (int i = 0; i < 10; i++) {
                    tablica[i] = wczytaj.nextFloat();
                }
                int wybor1 = 0;
                do {
                    System.out.println("1 Wyświetlanie tablicy od pierwszego do ostatniego indeksu.");
                    System.out.println("2 Wyświetlanie tablicy od ostatniego do pierwszego indeksu.");
                    System.out.println("3 Wyświetlanie elementów o nieparzystych indeksach.");
                    System.out.println("4 Wyświetlanie elementów o parzystych indeksach.");
                    System.out.println("5 Koniec.");

                    wybor1 = wczytaj.nextInt();

                    if (wybor1 == 1) {
                        for (int i = 0; i < 10; i++) {
                            System.out.println("Indeks " + i + " : " + tablica[i]);
                        }
                    }

                    if (wybor1 == 2) {
                        for (int i = 10; i > 0; i++) {
                            System.out.println("Indeks " + i + " : " + tablica[i]);
                        }
                    }

                    if (wybor1 == 3) {
                        for (int i = 1; i < 10; i = i + 2) {
                            System.out.println("Indeks " + i + " : " + tablica[i]);
                        }
                    }

                    if (wybor1 == 4) {
                        for (int i = 0; i < 10; i = i + 2) {
                            System.out.println("Indeks " + i + " : " + tablica[i]);
                        }
                    }

                    if (wybor1 == 5) {
                        continue;
                    }
                } while (wybor1 != 5);

                break;

            case 4:
                float[] tab = new float[10];
                float suma = 0;
                float srednia;
                float min = 0;
                float max = 0;
                float iloczyn = 1;

                for (int i = 0; i < 10; i++) {
                    tab[i] = wczytaj.nextFloat();
                }

                for (int i = 0; i < 10; i++) {
                    suma = suma + tab[i];
                    iloczyn = (iloczyn * tab[i]);
                    min = tab[0];
                    max = tab[0];
                    if (max < tab[i]) {
                        max = tab[i];
                    }
                    if (min > tab[i]) {
                        min = tab[i];
                    }
                }
                srednia = suma / 10;

                System.out.println("Suma: " + suma);
                System.out.println("Iloczyn: " + iloczyn);
                System.out.println("Srednia: " + srednia);
                System.out.println("Min: " + min);
                System.out.println("Max: " + max);
                break;
            case 6:
                int x;
                while (true) {
                    x = wczytaj.nextInt();
                    if (x < 0) {
                        break;
                    }
                }
                break;

            case 7:

                System.out.println("Ile wprowadzic elementow do tablicy: ");
                int n = wczytaj.nextInt();
                int tabl[] = new int[n];

                for (int i = 0; i < n; i++) {
                    tabl[i] = wczytaj.nextInt();
                }

                int pom = 0;

                for (int i = 1; i < n; i++) {
                    for (int j = n - 1; j >= 1; j--) {
                        if (tabl[j] < tabl[j - 1]) {
                            pom = tabl[j];
                            tabl[j] = tabl[j - 1];
                            tabl[j - 1] = pom;

                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(tabl[i] + " ");
                }

                break;
        }
    }

}
