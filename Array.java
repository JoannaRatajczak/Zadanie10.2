import java.util.Random;

public class Array {
    public static void main(String[] args) {

        int[] testTable = new int[10];
        Array.randomArray(testTable);
        Array.showReverseArray(testTable, 3);
    }


    static Random rand = new Random();

    public static void randomArray(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(10);
            System.out.print(tab[i]);
        }
    }

    public static void showReverseArray(int[] tab, int boundary) {

        System.out.println("\nWielkość tab:" + tab.length + " Ograniczenie: " + boundary);

        //tutaj zmniejszam o 1 ponieważ chodzi o numer elementu
        boundary-=1;

        for (int i = 0; i < tab.length; i++) {
            if (i <= boundary) {
                System.out.print(tab[boundary - i]);
            } else if (i >= boundary) {
                System.out.print(tab[i]);
            }

        }
    }
}
