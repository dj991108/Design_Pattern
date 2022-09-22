public class Student {
    private String name;
    private String major;
    private double midScore;
    private double finalScore;
    private double hwScore;

    public static class StudentBuilder {
        private String name;
        private String major;
        private double midScore;
        private double finalScore;
        private double hwScore;


        //public StudentBuilder(String name) {
        //    this.name = name;
        //}

        public StudentBuilder name(String name){ // method chaining 기법을 활용하기 위해 리턴값이 있음
            this.name = name;
            return this;
        }

        public StudentBuilder major(String major) {
            this.major = major;
            return this;
        }

        public StudentBuilder midScore(double midScore) {
            this.midScore = midScore;
            return this;
        }

        public StudentBuilder finalScore(double finalScore) {
            this.finalScore = finalScore;
            return this;
        }

        public StudentBuilder hwScore(double hwScore) {
            this.hwScore = hwScore;
            return this;
        }

        public Student build() {
            Student s = new Student();
            s.name = this.name;
            s.major = this.major;
            s.midScore = midScore;
            s.finalScore = this.finalScore;
            s.hwScore = this.hwScore;

            return s;
        }
    }

}
