public class Garage {
    private boolean isGarageOpen;
    private boolean isCarInGarage = false;
    private final float carWidth = 20;
    private final float carHeight = 10;
    private final float garageWidth = 100;
    private final float garageHeight = 70;
    private int howManyCarsCanBeInGarage;

    ConsoleManager consoleManager;

    public Garage(){
        System.out.println("Garage is working");
        consoleManager = new ConsoleManager();
    }

    public void openGarage(){
        System.out.println("Garage is" + consoleManager.Open());
        isGarageOpen = true;
    }

    public void closeGarage(){
        System.out.println("Garage is" + consoleManager.Close());
        isGarageOpen = false;
    }

    public void checkIfGarageOpen(){
        if (isGarageOpen == false){
            System.out.println("Garage is" + consoleManager.Close());
        }else {
            System.out.println("Garage is" + consoleManager.Open());
        }
    }

    public void countHowManyCarsCanBeInGarage(){
        float v = carHeight + carWidth;
        float s = garageHeight + garageWidth;
        howManyCarsCanBeInGarage = (int) (v/s);
        System.out.println(howManyCarsCanBeInGarage);
    }

    public int getHowManyCarsCanBeInGarage() {
        return howManyCarsCanBeInGarage;
    }

    public void checkIfCarInGarage(){
        if(isCarInGarage = false){
            System.out.println("Car" + consoleManager.notIn() +"garage");
        }else {
            System.out.println("Car" + consoleManager.In() + "garage");
        }
    }
}