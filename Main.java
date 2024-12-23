public class Main {
    public static void main(String[] args) {

        Student iuStudent = new IUStudent("Ivanov Ivan Ivanovich", 2, 85.5);
        Student mathStudent = new MathStudent("Petrov Petr Petrovich", 3, 90.0);

        iuStudent.writeExam();
        mathStudent.writeExam();

        StringArray stringArray = new StringArray();
        stringArray.add("Hello");
        stringArray.add("World");
        stringArray.add("Java");
        stringArray.add("Programming");

        System.out.println("Max length string: " + stringArray.getMaxLengthString());
        System.out.println("Average length: " + stringArray.getAverageLength());
    }
}