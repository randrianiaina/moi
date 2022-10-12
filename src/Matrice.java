import java.util.Scanner;

public class Matrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = 3;//ligne
        int c = 3;//col
        //exemple = A (L1C1 = 2; L1C2=3;l1C3=1),(L2C1=4;L2C2=9;L2C3=10)
        int[][] A = { { 2, 6, 1 }, { 4, 9, 10 }, { 3, 5, 2 } };
        int[][] B = { { 1, 3, 7 }, { 4, 5, 8 }, { 7, 3, 9 } };
        int[][] C = new int[l][c];
        //mon nouveau projet
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                C[i][j] = A[i][j] + B[i][j];

            }
        }
        System.out.println("La matrice A");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(A[i][j] + " ");

            }
            System.out.println(" ");
        }
        System.out.println("La matrice B ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(B[i][j] + " ");

            }
            System.out.println(" ");
        }
        System.out.println("La somme des matrices A et B ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(C[i][j] + " ");

            }
            System.out.println(" ");
        }

    }
}