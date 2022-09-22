import lombok.Builder;

@Builder
@Getter
public class StudentLombok {
    @NonNull
    private String name;
    private String major;
    private double midScore;
    private double finalScore;
    private double hwScore;
}
