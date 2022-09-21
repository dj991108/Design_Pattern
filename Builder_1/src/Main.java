public class Main {
    public static void main(String[] args) {
        Student s = new Student.StudentBuilder("insang")
                .major("ce")
                .midScore(100)
                .finalScore(90)
                .hwScore(95).build();
    }
}
