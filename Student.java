abstract class Student {
    protected String fullName;
    protected int course;
    protected double lastExamScore;

    public Student(String fullName, int course, double lastExamScore) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamScore = lastExamScore;
    }

    public abstract void writeExam();
}
