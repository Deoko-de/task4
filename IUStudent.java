class IUStudent extends Student {

    public IUStudent(String fullName, int course, double lastExamScore) {
        super(fullName, course, lastExamScore);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " (IU Student) is writing an exam.");
    }
}

