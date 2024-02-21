package kaupOOP;


import memberOOP.Person;

import java.util.Scanner;

public class KaupView {

    public static void main(String[] args) {
        int weight = (int)(Math.random()*50)+150;
        int height = (int)(Math.random()*69)+30;
        Person person = new memberOOP.Person(weight,height);

        KaupService service = new KaupServiceImpl();
        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();

        System.out.println("======== BMI 계산기 ========");
        System.out.println("이름 : " + person.getName());
        System.out.println("신장 : " + person.getHeight());
        System.out.println("체중 : " + person.getWeight());
//        System.out.println("BMI : " + Math.round(person.getBmi()));
        System.out.printf("BMI : %.1f", bmi);
        System.out.println();
        System.out.println("체질량 : " + bodyMass);
        System.out.println("======== BMI 계산기 ========");
    }
}