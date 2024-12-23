class MathStudent extends Student {

    public MathStudent(String fullName, int course, double lastExamScore) {
        super(fullName, course, lastExamScore);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " (Math Student) is writing an exam.");
    }
}

