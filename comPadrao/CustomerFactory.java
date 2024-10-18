public class CustomerFactory {
    public static final String[] names = {"Alice", "Bob", "Charlie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String validName : names) {
            if (validName.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}