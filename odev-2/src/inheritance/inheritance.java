package inheritance;

public class inheritance {
    public static void start() {
        Customer customer = new Customer();
        customer.mail = "asd";

        Employee employ = new Employee();
        employ.age = 32;
        employ.salary = 15;

        Person[] users = {customer, employ};

        CustomerManager manager1 = new CustomerManager();
        manager1.Add();

        EmployManager employ2 = new EmployManager();
        employ2.BestEmploye();


    }
}
