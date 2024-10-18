public class NullObjectDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Alice");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Diana");  // Not in the list
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Charlie");

        System.out.println("Customers:");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());  // Returns "Not Available"
        System.out.println(customer4.getName());
    }
}