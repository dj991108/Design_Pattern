public class Main {
    // Builder Pattern
    public static void main(String[] args) {
        Student s = new Student.StudentBuilder()
                .major("cee")
                .midScore(100)
                .finalScore(90)
                .hwScore(95).build();
    }
}
