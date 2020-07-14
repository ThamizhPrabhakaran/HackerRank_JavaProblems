import java.util.Scanner;

public class SockMer {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = in.nextInt();
    }
    int temp = 0;
    for(int i=0; i<n; i++) {
      for(int j=i+1; j<n; j++) {
        if(a[i]>a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    int count = 0;
    for(int i=0; i<n-1; i++) {
      if(a[i]==a[i+1]) {
          count=count+1;
          i = i+1;
      }
    }
    System.out.print(count);
  }
}
