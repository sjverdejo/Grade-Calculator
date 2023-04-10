package grade_calculator;

public class Grade {
    private double grade;
    private double weight;

    public Grade() {
        grade = 0.0;
        weight = 0.0;
    }

    public Grade(double grade, double weight) {
        this.grade = grade;
        this.weight = weight;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ("Grade: " + grade + " - Weight: " + weight);
    }

    public double calculateWeightedGrade() {
        return (weight * 0.0100) * grade;
    }
}
