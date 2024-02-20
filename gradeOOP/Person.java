package gradeOOP;

public class Person {
    private String name;
    private int korean;
    private int english;
    private int math;
    private int avg;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createKorean() {
        this.korean = (int) (Math.random() * 100);
    }

    public int getKorean() {
        return korean;
    }

    public void createEnglish() {
        this.english = (int) (Math.random() * 100);
    }

    public int getEnglish() {
        return english;
    }

    public void createMath() {
        this.math = (int) (Math.random() * 100);
    }

    public int getMath() {
        return math;
    }

    public int getAvg() {
        return avg;
    }

    public void createAvg() {
        this.avg = (korean + english + math) / 3;
    }
}
