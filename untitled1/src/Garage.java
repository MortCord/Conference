public class Garage {
    private boolean isGarageOpen;
    private boolean isCarInGarage = false;
    private final float carWidth = 20;
    private final float carHeight = 10;
    private final float garageWidth = 100;
    private final float garageHeight = 70;
    private int howManyCarsCanBeInGarage;

    public Garage(){
        System.out.println("Garage is working");
    }

    public void openGarage(){
        System.out.println("Garage is opened");
        isGarageOpen = true;
    }

    public void closeGarage(){
        System.out.println("Garage is closed");
        isGarageOpen = false;
    }

    public void checkIfGarageOpen(){
        if (isGarageOpen == false){
            System.out.println("Garage is closed");
        }else {
            System.out.println("Garage is opened");
        }
    }

    public void countHowManyCarsCanBeInGarage(){
        float v = carHeight + carWidth;
        float s = garageHeight + garageWidth;
        howManyCarsCanBeInGarage = (int) (v/s);
    }

    public int getHowManyCarsCanBeInGarage() {
        return howManyCarsCanBeInGarage;
    }

    public void checkIfCarInGarage(){
        if(isCarInGarage = false){
            System.out.println("Car is not in garage");
        }else {
            System.out.println("Car in garage");
        }
    }
}
