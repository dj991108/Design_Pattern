import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("insang1");
        Customer c2 = new Customer("insang2");
        Customer c3 = new Customer("insang3");
        Customer c4 = new Customer("insang4");
        Customer c5 = new Customer("insang5");

        c1.setPoints(150);
        c2.setPoints(250);
        c3.setPoints(90);
        c4.setPoints(110);
        c5.setPoints(50);

        List<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);

        ReportGenerator rg = new SimpleReportGenerator();
        System.out.println(rg.generate(customers));

        ReportGenerator rg1 = new ComplexReportGenerator();
        System.out.println(rg1.generate(customers));

    }
}
