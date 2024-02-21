package memberOOP;

import java.util.Scanner;

public class Person {
    private String id;
    private String password;
    private String checkPassword;
    private String name;
    private int residentRegistrationNumber;
    private int phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;

    // 카우프 지수에서 사용하는 생성자
    public Person(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    // 회원가입에서 사용하는 생성자
    public Person(String id, String password, String checkPassword, String name, int residentRegistrationNumber,
                  int phoneNumber, String address, String job) {
        this.id = id;
        this.password = password;
        this.checkPassword = checkPassword;
        setName(name);
        setResidentRegistrationNumber(residentRegistrationNumber);
        setPhoneNumber(phoneNumber);
        setAddress(address);
        setJob(job);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setCheckPassword(String checkPassword) {
        this.checkPassword = checkPassword;
    }

    public String getCheckPassword() {
        return checkPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setResidentRegistrationNumber(int residentRegistrationNumber) {
        this.residentRegistrationNumber = residentRegistrationNumber;
    }

    public int getResidentRegistrationNumber() {
        return residentRegistrationNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setHeight() {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", checkPassword='" + checkPassword + '\'' +
                ", name='" + name + '\'' +
                ", residentRegistrationNumber=" + residentRegistrationNumber +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
