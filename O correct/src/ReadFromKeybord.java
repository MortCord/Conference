import java.util.Scanner;

public class ReadFromKeybord {
    Scanner scanner;
    public ReadFromKeybord(){
        scanner = new Scanner(System.in);
    }

    public int readInt(){
        return scanner.nextInt();
    }
}
