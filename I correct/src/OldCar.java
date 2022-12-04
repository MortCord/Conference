public class OldCar implements ICarMethodsOld{
    public OldCar(){
        System.out.println("I don't have radio but i have doors");
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

