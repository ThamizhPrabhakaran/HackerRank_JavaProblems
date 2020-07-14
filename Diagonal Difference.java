import java.util.Scanner;

public class DiagonalDifference {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int row = n;
        int column = n;
        int[][] a = new int [row][column];
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                a[i][j] = input.nextInt();
            }
        }
        int leftsum=0, rightsum=0;
        for (int i=0; i<row; i++){
            leftsum += a[i][i];
            rightsum += a[i][n-1-i];
        }
        int difference = leftsum - rightsum;
        System.out.print(Math.abs(difference)); 
    }
}
