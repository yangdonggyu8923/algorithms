package baekjoon.bronze;

import java.util.Scanner;

public class BikeSpeed2765 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.1415927;
        int mileToFeet = 5280;
        int feetToInch = 12;
        int hourToMinute = 60;
        int MinuteToSec = 60;

        int N = 1;
        while (true) {
            double distance = 0;
            double mph = 0;
            double d = sc.nextDouble();
            int c = sc.nextInt();
            double s = sc.nextDouble();

            if (c == 0)
                break;

            distance = (d*pi*c) / (mileToFeet * feetToInch);
            mph = distance* MinuteToSec * hourToMinute / s;
            System.out.println("Trip #" + N + ": " + String.format("%.2f", distance) +
                    " " + String.format("%.2f", mph));
            N++;
        }
        sc.close();
    }
}