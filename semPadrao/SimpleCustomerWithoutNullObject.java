public class SimpleCustomerWithoutNullObject {
    private String name;

    public SimpleCustomerWithoutNullObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        
        SimpleCustomerWithoutNullObject customer1 = findCustomer(names, "Alice");
        SimpleCustomerWithoutNullObject customer2 = findCustomer(names, "Bob");
        SimpleCustomerWithoutNullObject customer3 = findCustomer(names, "Diana"); // Not in the list
        SimpleCustomerWithoutNullObject customer4 = findCustomer(names, "Charlie");

        System.out.println("Customers:");
        System.out.println(customer1 != null ? customer1.getName() : "Not Available");
        System.out.println(customer2 != null ? customer2.getName() : "Not Available");
        System.out.println(customer3 != null ? "Not Available" : "Not Available");
        System.out.println(customer4 != null ? customer4.getName() : "Not Available");
    }

    public static SimpleCustomerWithoutNullObject findCustomer(String[] validNames, String name) {
        for (String validName : validNames) {
            if (validName.equalsIgnoreCase(name)) {
                return new SimpleCustomerWithoutNullObject(name);
            }
        }
        return null;
    }
}
