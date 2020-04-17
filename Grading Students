import java.util.Scanner;

public class Grades {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = in.nextInt();
    }
    for(int i=0; i<n; i++) {
      if(a[i]>=38) {
        int r = a[i] % 5;
        int min = a[i] - r;
        int max = min + 5;
        int sub = max - a[i];
        if(sub<3) {
          System.out.print(max+ " ");
        } else {
          System.out.print(a[i]+ " ");
        }
      }
      if(a[i]<38) {
        System.out.print(a[i]+ " ");
      }
      System.out.print("\n");
    }
  }
}
