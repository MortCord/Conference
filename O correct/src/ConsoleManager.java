public class ConsoleManager {
    public void printRules(){
        System.out.println("1 - open garage, 2 - close garage, 3 - check if garage is opened, 4 - count how many cars can be in garage, 5 - check if car in garage");
    }

    public void correctNum(){
        System.out.println("Please write a correct num");
    }

    public String Open(){
        String i = " opened";
        return i;
    }

    public String Close(){
        String i = " closed";
        return i;
    }

    public String In(){
        String i = " is in ";
        return i;
    }

    public String notIn(){
        String i = " is not in ";
        return i;
    }
}
