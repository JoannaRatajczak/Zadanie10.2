import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] testTable = null; //new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Array.randomArray(testTable); jeżeli chcemy randomowe

        if (testTable == null) {
            System.out.println("pusta tablica! Podaj ile elementową tablicę chcesz wprowadzić");
            int x = scan.nextInt();
            testTable = new int[x];
            for (int i = 0; i < testTable.length; i++) {
                System.out.println("Element "+i);
                testTable[i] = scan.nextInt();

            }
        }

        System.out.println("\nPodaj granicę");

        int boundary;
        do {
            boundary = scan.nextInt();
            scan.nextLine();
        } while (boundary > testTable.length || boundary == 0);

        int[] newTab = Array.showReverseArray(testTable, boundary);
        for (int i = 0; i < newTab.length; i++) {
            System.out.print(newTab[i] + ",");
        }

    }

    // Etap tworzenia tablicy z uzyciem Random
    static Random rand = new Random();

    public static void randomArray(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(10);
            System.out.print(tab[i]);
        }
    }

    //funkcja odwracjąca
    public static int[] showReverseArray(int[] tab, int boundary) {

        System.out.println("\nWielkość tab:" + tab.length + " Ograniczenie: " + boundary);
        //tutaj zmniejszam o 1 ponieważ chodzi o numer elementu
        boundary -= 1;
        int[] newTab = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            if (i <= boundary) {
                newTab[i] = tab[boundary - i];
            } else if (i >= boundary) {
                newTab[i] = tab[i];
            }
        }
        return newTab;
    }
}
