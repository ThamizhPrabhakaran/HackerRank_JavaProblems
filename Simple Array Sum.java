import java.util.Scanner;

public class ArraySum {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int sum = 0;
    int[] a = new int[n];
    for (int i=0; i<n; i++) {
      a[i] = in.nextInt();
    }
    for (int i=0; i<n; i++) {
      sum=sum+a[i];
    }
    System.out.print(sum);
    
  }
}
