package ovning13;

public class Owner {
    private String name;
    private String adress;
    private Car car;

    public Owner(String name, String address){
        this.name = name;
        this.adress = address;
        this.car = null;
    }

    public void setCar(Car newCar){
        if (newCar.getOwner()==null){
            car = newCar;
            car.setOwner(this);
        }
    }

    public Car getCar(){
        return car;
    }

    public void removeCar(){
        car = null;
    }

    public String toString(){
        String info = name + ", " + adress + ". ";
        info += (car == null)? ("No car.") : ("Car: " + car.toString());
        return info;
    }
}
