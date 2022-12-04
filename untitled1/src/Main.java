import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        while(true){
            Scanner scanner = new Scanner(System.in);
            int choice;
            System.out.println("1 - open garage, 2 - close garage, 3 - check if garage is opened, 4 - count how many cars can be in garage, 5 - check if car in garage");
            choice = scanner.nextInt();
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
                    System.out.println("Please write a correct num");
                    break;
            }
        }
    }
}