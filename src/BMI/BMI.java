package BMI;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        return weight / (height * height);
    }

    public void getBMIStatus() {
        double index = getBMI();
        if (index < 18.5) System.out.println("Skinny");
        else if (index < 25) System.out.println("Ideal");
        else if (index < 30) System.out.println("Overweight");
        else System.out.println("Obese");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
