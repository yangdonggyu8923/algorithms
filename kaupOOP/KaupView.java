package kaupOOP;

import java.util.Scanner;

public class KaupView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("체중과 신장, 이름을 입력해주세요.");
        String name = sc.next();

        person.setName(name);
        person.createHeight();
        person.createWeight();
        person.createBmi();
        person.createBodyMass();

        System.out.println("======== BMI 계산기 ========");
        System.out.println("이름 : " + person.getName());
        System.out.println("신장 : " + person.getHeight());
        System.out.println("체중 : " + person.getWeight());
//        System.out.println("BMI : " + Math.round(person.getBmi()));
        System.out.printf("BMI : %.1f", person.getBmi());
        System.out.println();
        System.out.println("체질량 : " + person.getBodyMass());
        System.out.println("======== BMI 계산기 ========");
    }
}