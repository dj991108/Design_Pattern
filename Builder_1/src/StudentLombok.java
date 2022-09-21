import lombok.Builder;

@Builder
public class StudentLombok {
    private String name;
    private String major;
    private double midScore;
    private double finalScore;
    private double hwScore;
}
