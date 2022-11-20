public class Sharp extends ReportAdded{
    public Sharp(Report report) {
        super(report);
    }

    public void displayContent() {
        displaySharp();
        super.displayContent();
        displaySharp();
    }
    private void displaySharp() {
        System.out.println("################");
    }
}
