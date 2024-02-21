package matrixTest;

public class Matrix5 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 1;
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                switch (i) {
                    case 0:
                        mtx[i][j] = k;
                        k++;
                        break;
                    case 1:
                        k += 4;
                        mtx[i][j] = k;
                        k -= 5;
                        break;
                    case 2:
                        k += 10;
                        mtx[i][j] = k;
                        k -= 9;
                        break;
                    case 3:
                        k += 14;
                        mtx[i][j] = k;
                        k -= 15;
                        break;
                    case 4:
                        k += 24;
                        mtx[i][j] = k;
                        k-=25;
                        break;
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