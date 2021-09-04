package object.Demo;

public class Student extends Person {
    public int score;
    private int grade;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 1;
    }
}

