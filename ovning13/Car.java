package ovning13;

public class Car {
    private String reg;
    private String make;
    private Owner owner;

    public Car(String reg, String make){
        this.reg = reg;
        this.make = make;
        this.owner = null;
    }

    void setOwner(Owner newOwner){
        this.owner = newOwner;
    }

    Owner getOwner(){
       return owner;
    }

    void removeOwner(){
        owner = null;
    }

    public String toString(){
        return reg + " " + make;
    }
}
