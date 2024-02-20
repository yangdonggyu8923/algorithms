package kaupOOP;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void createHeight() {
        ;
        this.height = ((int) (Math.random() * 50) + 150);
    }

    public double getHeight() {
        return this.height;
    }

    public void createWeight() {
        this.weight = ((int) (Math.random() * 69) + 30);
    }

    public double getWeight() {
        return this.weight;
    }

    public double getBmi() {
        return this.bmi;
    }

    public String getBodyMass() {
        return this.bodyMass;
    }

    public void createBmi() {
        this.bmi = weight / (((height / 100) * (height / 100)));
    }

    public void createBodyMass() {
        String bodyMass = "";
        if (bmi < 18.5) {
            bodyMass = "저체중";
        } else if (bmi < 23) {
            bodyMass = "정상";
        } else if (bmi < 25) {
            bodyMass = "과체중";
        } else if (bmi > 25) {
            bodyMass = "비만";
        }
        this.bodyMass = bodyMass;
    }
}

