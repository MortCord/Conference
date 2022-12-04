public class CoolCar implements ICarMethods {
    public CoolCar(){
        System.out.println("I have doors and radio");
    }
    @Override
    public void turnOnRadio() {
        System.out.println("Radio turned on");
    }

    @Override
    public void turnOffRadio() {
        System.out.println("Radio turned off");
    }

    @Override
    public void closeCar() {
        System.out.println("Car closed");
    }

    @Override
    public void openCar() {
        System.out.println("Car opened");
    }
}
