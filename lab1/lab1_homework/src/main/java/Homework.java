import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

       /* if(args.length<1){
            System.out.println("Not enough arguments!");
            System.exit(-1);
        }*/

        Scanner keyboard = new Scanner(System.in);
        long t1 = System.currentTimeMillis();
        System.out.println("enter an integer");
        int n = keyboard.nextInt();
        //int n = Integer.parseInt(args[0]);
        int[][] latinSquare = new int[n][n];

        if(n>30000){
            for (int i = 0; i < n; i++) {
                latinSquare[0][i] = i + 1;
            }

            for (int i = 1; i < n; i++)
                for (int j = 1; j < n; j++) {
                    latinSquare[i][j] = latinSquare[i - 1][j - 1];
                    latinSquare[i][0] = latinSquare[i - 1][n - 1];
                }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(latinSquare[i][j] + " ");
                }
                System.out.println();
            }
            String matrixColumns = new String();
            String matrixRows = new String();
            for (int index = 0; index < n; index++) {
                for (int i = 0; i < n; i++) {
                    matrixRows = matrixRows + latinSquare[index][i];
                    matrixColumns = matrixColumns + latinSquare[i][index]; // dc nu e necesara sa facem conversie la string?
                }
                int contor = 1;
                System.out.println("This is column number " + contor + ": " + matrixColumns);
                System.out.println("This is row number " + contor + ": " + matrixRows);
                matrixColumns = "";
                matrixRows = "";
                contor++;
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Runtime of the application is " + (t2-t1) + " milliseconds");

    }
}
