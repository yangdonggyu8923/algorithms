package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int[] arr = new int[9];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int fake1 = 0;
        int fake2 = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(total - arr[i] - arr[j] == 100){
                    fake1 = arr[i];
                    fake2 = arr[j];
                }
            }
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            if(fake1 != arr[i] && fake2 != arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}
