package ovning14;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pnr andersPnr = Pnr.createPnr("600101-1111"); // constructor is private
        Member anders = new Member("Anders Lindström", andersPnr);
        System.out.println(anders.toString());
        Kayak k1 = new Kayak("WKV 540", KLevel.SKILLED, 1, anders);
        Kayak k2 = new Kayak("Point 65", KLevel.EASY, 2, anders);
        LoanManager manager = new LoanManager();
        manager.addKayak(k1);
        manager.addKayak(k2);
        System.out.println(manager.toString());
        List<Kayak> available = manager.getAvailableKayaks(LocalDate.now());
        System.out.println("Available today: " + available.toString());
        manager.addLoan(anders, k1, LocalDate.now());
        available = manager.getAvailableKayaks(LocalDate.now());
        System.out.println("Available today: " + available.toString());
// this will throw an exception
        manager.addLoan(anders, k1, LocalDate.now());
    }
}
