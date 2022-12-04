import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        ConsoleManager consoleManager = new ConsoleManager();
        ReadFromKeybord read = new ReadFromKeybord();
        while(true){
            consoleManager.printRules();
            int choice = read.readInt();
            switch (choice){
                case 1:
                    garage.openGarage();
                    break;
                case 2:
                    garage.closeGarage();
                    break;
                case 3:
                    garage.checkIfGarageOpen();
                    break;
                case 4:
                    garage.countHowManyCarsCanBeInGarage();
                    break;
                case 5:
                    garage.checkIfCarInGarage();
                    break;
                case default:
                    consoleManager.correctNum();
                    break;
            }
        }
    }
}