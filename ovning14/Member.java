package ovning14;

public class Member {

  private final String fullName;
  private final Pnr pnr;

  public Member(String fullName, Pnr pnr){
      this.fullName = fullName;
      this.pnr = pnr;
  }

  public String getFullName() {
    return fullName;
  }

  public Pnr getPnr() {
    return pnr;
  }

  public String toString(){
    return fullName + " " + pnr.toString();
  }

}
