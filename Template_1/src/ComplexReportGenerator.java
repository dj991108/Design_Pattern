import java.util.ArrayList;
import java.util.List;

public class ComplexReportGenerator extends ReportGenerator{
    @Override
    protected String genFooter(List<Customer> selected) {
        String footer = "";
        int totalPoints = 0;
        for(Customer customer : selected){
            totalPoints += customer.getPoints();
        }
        footer += String.format("+++++++++++++++++++++++++++++\n");
        footer += String.format("Total Points : %d \n",totalPoints);
        footer += String.format("+++++++++++++++++++++++++++++\n");
        return footer;
    }

    @Override
    protected String genBody(List<Customer> selected) {
        int i = 1;
        String body = "";
        for(Customer customer : selected){
            body += String.format("%d %d : %s\n",i,customer.getPoints(), customer.getName());
            i++;
        }
        return body;
    }

    @Override
    protected String getHeaderChar() {
        return "+";
    }

//    @Override
//    protected String genHeader(List<Customer> selected) {
//        String header = String.format("+++++++++++++++++++++++++++++\n");
//        header += String.format("Number of Customers : %d \n", selected.size());
//        header += String.format("+++++++++++++++++++++++++++++\n");
//        return header;    }

    @Override
    protected List<Customer> selectCustomers(List<Customer> customers) {
        List<Customer> selected = new ArrayList<>();

        for(Customer customer : customers){
            if(customer.getPoints() >= 100)
                selected.add(customer);
        }
        return selected;
    }
}
