package memberOOP;

import java.util.Scanner;

public class MemberView {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID");
        String id = scanner.next();
        person.setId(id);

        System.out.println("비밀번호");
        String password = scanner.next();
        person.setPassword(password);

        System.out.println("비밀번호 확인");
        String checkPassword = scanner.next();
        person.setCheckPassword(checkPassword);

        System.out.println("이름");
        String name = scanner.next();
        person.setName(name);

        System.out.println("주민번호");
        int residentRegistrationNumber = scanner.nextInt();
        person.setResidentRegistrationNumber(residentRegistrationNumber);

        System.out.println("전화번호");
        int phoneNumber = scanner.nextInt();
        person.setPhoneNumber(phoneNumber);

        System.out.println("주소");
        String address = scanner.next();
        person.setAddress(address);

        System.out.println("직업");
        String job = scanner.next();
        person.setJob(job);

        System.out.println("ID : " + person.getId());
        System.out.println("비밀번호 : " + person.getPassword());
        System.out.println("비밀번호 확인 : " + person.getCheckPassword());
        System.out.println("이름 : " + person.getName());
        System.out.println("주민번호 : " + person.getResidentRegistrationNumber());
        System.out.println("전화번호 : " + person.getPhoneNumber());
        System.out.println("주소 : " + person.getAddress());
        System.out.println("직업 : " + person.getJob());


    }
}