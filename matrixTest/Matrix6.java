package matrixTest;

//1 2 3 4 5
//10 9 8 7 6
//11 12 13 14 15
//20 19 18 17 16
//21 22 23 24 25
public class Matrix6 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 1;
        for (int i = 0; i < mtx.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mtx[i].length; j++) {
                    mtx[i][j] = k;
                    k++;
                }
            } else {
                for (int j = mtx[i].length - 1; j >= 0; j--) {
                    mtx[i][j] = k;
                    k++;
                }
            }


        }
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }
}