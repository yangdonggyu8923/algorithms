package basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        String number1 = sc.next();
        System.out.println("숫자를 입력하세요.");
        String number2 = sc.next();
        System.out.println("+, -, *, /을 입력하세요");
        String opcode = sc.next();
        int result = 0;
        int intNum1 = Integer.parseInt(number1);
        int intNum2 = Integer.parseInt(number2);

//        if (opcode.equals("+")) {
//            result = intNum1 + intNum2;
//        } else if (opcode.equals("-")) {
//            result = intNum1 - intNum2;
//        } else if (opcode.equals("*")) {
//            result = intNum1 * intNum2;
//        } else if (opcode.equals("/")) {
//            result = intNum1 / intNum2;
//        } else {
//            System.out.println("잘못된 연산 기호입니다.");
//        }

        switch(opcode){
            case "+": result = intNum1 + intNum2; break;
            case "-": result = intNum1 - intNum2; break;
            case "*": result = intNum1 * intNum2; break;
            case "/": result = intNum1 / intNum2; break;
            default:
                System.out.println("잘못된 연산자");
        }


        System.out.println("첫 번째 숫자 : " + number1);
        System.out.println("두 번째 숫자 : " + number2);
        System.out.println("결과 : " + result);
    }
}
