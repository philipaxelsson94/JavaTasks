package ovning14;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoanManager implements ILoanManager{
    private ArrayList<Kayak> theKayaks;
    private ArrayList<Loan> theLoans;

    public LoanManager(){
        this.theKayaks = new ArrayList<Kayak>();
        this.theLoans = new ArrayList<Loan>();
    }

    @Override
    public List<Kayak> getKayaks() {
        return (ArrayList<Kayak>) theKayaks.clone();
    }

    @Override
    public List<Loan> getLoans() {
        return (ArrayList<Loan>) theLoans.clone();
    }

    @Override
    public void addKayak(Kayak kayak) throws IllegalArgumentException {
        if (theKayaks.contains(kayak)){
            throw new IllegalArgumentException("Already exists");
        }
        else{
            theKayaks.add(kayak);
        }
    }

    @Override
    public void addLoan(Member borrower, Kayak kayak, LocalDate loanDate) throws IllegalArgumentException {
        for (Loan loan : theLoans){
            if(loan.getKayak().equals(kayak) && loan.getLoanDate().equals(loanDate)){
                throw new IllegalLoanException(kayak.getModel() + " , " + loanDate);
            }
        }
        theLoans.add(new Loan(kayak, borrower, loanDate));
    }

    @Override
    public List<Loan> getLoansFor(Kayak kayak) {
        ArrayList<Loan> occupiedKayaks = new ArrayList<Loan>();
        for (Loan l : theLoans){
            if (l.getKayak().equals(kayak)){
                occupiedKayaks.add(l);
            }
        }
        return occupiedKayaks;
    }

    @Override
    public List<Kayak> getAvailableKayaks(LocalDate targetDate) {
        ArrayList<Kayak> availableKayaks = new ArrayList<Kayak>();
        for (Kayak kayak : theKayaks){
            for (Loan loan : theLoans){
                if (loan.getKayak().equals(kayak) && loan.getLoanDate()==targetDate){
                    break;
                }
            }
            availableKayaks.add(kayak);
        }
        return availableKayaks;
    }
    public String toString(){
        return "LoanManager {kayaks: " + theKayaks.size() + ", loans: " + theLoans.size() + "}";
    }
}
