package ovning14;

public class Kayak {
    private final String model;
    private final KLevel level;
    private final long number;
    private Member caretaker;

    public Kayak(String model, KLevel level, long number, Member caretaker){
        this.model = model;
        this.level = level;
        this.number = number;
        this.caretaker = caretaker;
    }

    public void setCaretaker(Member caretaker){
        this.caretaker = caretaker;
    }

    public String getModel(){
        return model;
    }

    public String toString(){
        return "kayak{model=" + model + ",level=" + level + ", number=" + number;
    }

}
