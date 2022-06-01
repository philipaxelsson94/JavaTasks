package ovning14;

import java.time.LocalDate;

public class Loan {
    private final Kayak kayak;
    private final Member borrower;
    private final LocalDate loanDate;

    public Loan(Kayak kayak, Member borrower, LocalDate loanDate){
        this.kayak = kayak;
        this.borrower = borrower;
        this.loanDate = loanDate;
    }

    public Kayak getKayak(){
        return kayak;
    }

    public LocalDate getLoanDate(){
        return loanDate;
    }

    public String toString(){
        return kayak.toString() + " " + borrower.toString() + " " + loanDate.toString();
    }
}
