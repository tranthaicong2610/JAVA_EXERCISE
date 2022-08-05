package session12.baitap.b2;


public class Main {
    private static ValidatedPhone phone;
    public static final String[] validName = new String[]{"(84)-(0978489648)", "(84)-(1354165415)", "(51)-(5454124154)"};
    public static final String[] invalidName = new String[]{"vss", "java", "viettel"};

    public static void main(String args[]) {
        phone = new ValidatedPhone();
        for (String name : validName) {
            boolean isvalid = phone.validate(name);
            System.out.println("Phone is " + name + " is valid: " + isvalid);
        }
        for (String name : invalidName) {
            boolean isvalid = phone.validate(name);
            System.out.println("Phone is " + name + " is valid: " + isvalid);
        }
    }
}
