import java.util.Scanner;

public class OPST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of Tape: ");
        int n = sc.nextInt();
        int[] length = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter length of Tape "+ (i+1)+" :");
            length[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (length[i] > length[j]) {
                    int temp = length[i];
                    length[i] = length[j];
                    length[j] = temp;
                }
            }
        }
        
        int total = 0;
        int retrieval = 0;
        
        for (int i = 0; i < n; i++) {
            retrieval = retrieval + length[i];
            total = total + retrieval;
        }
        
        double average = (double) total / n;
        
        System.out.print("Optimal order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(length[i] + " ");
        }
        System.out.println();
        
        System.out.println("Total Retrieval Time: " + total);
        System.out.println("Average Retrieval Time: " + average);
        
        sc.close();
    }
}
