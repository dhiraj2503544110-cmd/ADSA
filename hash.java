import java.util.Scanner;

public class HashIndexing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hash table size: ");
        int size = sc.nextInt();

        int table[] = new int[size];

        for (int i = 0; i < size; i++) {
            table[i] = -1;
        }

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int index = key % size;

            while (table[index] != -1) {
                index = (index + 1) % size;
            }

            table[index] = key;
        }

        System.out.println("Hash Table:");

        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + table[i]);
        }

        sc.close();
    }
}
