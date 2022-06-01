package ovning14;

// Class of prsNr. If the parameter matches the pattern create new Pnr object. There is a private constructor
// and the object is created by calling the static method "createPnr" which class the private constructor.

public class Pnr {
    private final String pnrStr;
    private static final String pnrPattern = "^(19|20)?[0-9]{6}[- ]?[0-9]{4}$";

    private Pnr(String pnr) throws IllegalArgumentException{
        this.pnrStr = pnr;
    }
    public static Pnr createPnr(String pnr) throws IllegalArgumentException{
        if (pnr.matches(pnrPattern)){
            return new Pnr(pnr);
        }
        else throw new IllegalArgumentException("wrong email");
    }

    public String getPnr(){
        return pnrStr;
    }

    public String toString(){
        return pnrStr;
    }
}
