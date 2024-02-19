package kaupTest;

import java.util.Scanner;

public class KaupMain {

    //카우프지수 구하는 프로그램을 작성해 주세요.
    //카우프지수 = 체중(kg) / 신장(m)2
    //키 150~200, 무게 30~99
    public static void main(String[] args) {
        System.out.println("체중과 신장을 입력해주세요.");
        double randomHeight = (int)(Math.random() * 50) + 150;
        System.out.println("신장 : " + randomHeight);
        double randomWeight = (int)(Math.random() * 69) + 30;
        System.out.println("체중 : " + randomWeight);

        double randomHeight2 = randomWeight / (((randomHeight/100)*(randomHeight/100)));
        System.out.println(Math.round(randomHeight2));
    }
}
