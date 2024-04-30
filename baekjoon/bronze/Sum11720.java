package baekjoon.bronze;

import java.util.Scanner;

public class Sum11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        String a = sc.next();
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
