package ovning9;


public class Main {

    public static void main(String[] args) {
        ListOfAccounts list = new ListOfAccounts();
        Account a = new Account("Ann");
        Account b = new Account("Per");
        Account c = new Account("Ida");
        a.deposit(1000);
        b.deposit(500);
        list.addAccount(a);
        list.addAccount(b);
        list.addAccount(c);
        list.addAccount(new Account("Anders"));
        System.out.println("The list: " + list.toString());
// Remove Per from list
        Account p = list.removeAccount(1);
        System.out.println("Removed object: " + p.toString());
        System.out.println("The list: " + list.toString());
// Get a reference to Ann, without removing form list
        Account q = list.getAccount(0);
        q.deposit(100);
        System.out.println("The list: " + list.toString());


    }
}

