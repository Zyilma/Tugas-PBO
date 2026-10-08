public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        this.customers = new Customer[10];
        this.numberOfCustomers = 0;
    }

    public Bank(int maxCustomers) {
        if (maxCustomers <= 5) {
            maxCustomers = 10;
        }
        this.customers = new Customer[maxCustomers];
        this.numberOfCustomers = 0;
    }

  
    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            Customer c = new Customer(f, l);
            customers[numberOfCustomers] = c;
            numberOfCustomers++;
        } else {
            System.out.println("Kapasitas bank sudah penuh!");
        }
    }

    
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    
    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }
}
