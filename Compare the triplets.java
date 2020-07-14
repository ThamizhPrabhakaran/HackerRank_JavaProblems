import java.util.Scanner;

public class Triplets {
    public static void main (String[] args) {
        int n = 3;
        Scanner input = new Scanner (System.in);
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = input.nextInt();
        }
        for (int i=0; i<n; i++) {
            b[i] = input.nextInt();
        }
        int aSum = 0;
        int bSum = 0;
        for (int i=0; i<n; i++) {
            if (a[i] > b[i]) {
                aSum++;
            } else if (b[i] > a[i]) {
                bSum++;
            }
        }
        System.out.println(aSum+" "+bSum);
    }
}
