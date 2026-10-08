public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Jane", "Doe");
        bank.addCustomer("John", "Smith");
        bank.addCustomer("Ian", "Dalton");

        System.out.println("Jumlah customer di bank: " + bank.getNumOfCustomers());

        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer cust = bank.getCustomer(i);
            System.out.println("Customer " + (i+1) + ": " + cust.getFirstName() + " " + cust.getLastName());
        }
    }
}