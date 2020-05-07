import java.util.Scanner;

public class AngProf {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    int test = in.nextInt();
    for(int i=0; i<test; i++) {
      int n = in.nextInt();
      int k = in.nextInt();
      int count = 0;
      int[] a = new int[n];
      for(int j=0; j<n; j++) {
        a[j] = in.nextInt();
        if(a[j]<=0) {
          count=count+1;
        }
      }
      if(count<k) {
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
      System.out.print("\n");
    }
  }
}
