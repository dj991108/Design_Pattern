public class MainLombok {
    public static void main(String[] args) {
        StudentLombok s = new StudentLombok.StudentLombokBuilder()
                .name("insane")
                .major("ce")
                .midScore(100)
                .finalScore(90)
                .hwScore(95).build();
    }
}
