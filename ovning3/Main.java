package ovning3;


public class Main {

    public static void main(String[] args) {
        Account acc = new Account("Anders", 123456, 1000.0);
        long accNo = acc.getNumber();
        System.out.println("account number: " + accNo);
        System.out.println(acc.toString());
    }
}