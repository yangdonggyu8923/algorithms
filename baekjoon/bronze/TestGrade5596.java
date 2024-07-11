package baekjoon.bronze;

import java.util.Scanner;

public class TestGrade5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int[] arr2 = new int[4];
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
            sum2 += arr2[i];
        }

        if(sum==sum2){
            System.out.println(sum);
        }else {
            System.out.println(Math.max(sum, sum2));
        }

    }
}
