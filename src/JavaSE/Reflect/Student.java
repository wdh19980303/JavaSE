package JavaSE.Reflect;

public class Student extends Person implements Move, Study {
    public int score = 0;
    private String school = "";

    public Student() {
        System.out.println("无参构造");
    }

    public Student(int score) {
        this.score = score;

        System.out.println("score" + this.score);
    }

    public int getScore() {
        return score;
    }

    public String getSchool() {
        return school;
    }

    public void setField(String school, int score) {
        this.school = school;
        this.score = score;
        System.out.println(this.score + "\n" + this.school);
    }

    private void setScore(int score) {
        this.score = score;
    }

    private void setSchool(String school) {
        this.school = school;
        System.out.println("school = " + this.school);
    }

    public Student(int score, String school) {
        this.score = score;
        this.school = school;
        System.out.println("score = " + score + "\n" + "school = " + school);
    }

    private Student(String school) {
        this.school = school;
        System.out.println("school" + this.school);
    }

    @Override
    public void moveType() {
        System.out.println("火箭上学");
    }

    @Override
    public void info() {
        System.out.println("自行车上学");
    }
}
