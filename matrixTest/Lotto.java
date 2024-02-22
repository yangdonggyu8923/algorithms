package matrixTest;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            int num = (int) (Math.random() * 44) + 1;
            for (int j = -1; j < i; j++) {
                if (lotto[i] == num) {
                    num = (int) (Math.random() * 44) + 1;
                    j=-1;
                }
                else{lotto[i] = num;}
            }
        }
        Arrays.sort(lotto);
        for (int i = 0; i < 6; i++) {
                System.out.print(lotto[i]+" ");

        }
    }
}