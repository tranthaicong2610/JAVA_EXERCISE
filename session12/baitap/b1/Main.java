package session12.baitap.b1;

import session12.thuchanh.validate_email.EmailExample;

public class Main {
    private static NameClass nameClass;
    public static final String[] validName = new String[]{"A4654G", "C4456K", "P4654L"};
    public static final String[] invalidName = new String[]{"vss", "java", "viettel"};

    public static void main(String args[]) {
        nameClass = new NameClass();
        for (String name : validName) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Name Class is " + name + " is valid: " + isvalid);
        }
        for (String name : invalidName) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Name Class is " + name + " is valid: " + isvalid);
        }
    }
}
