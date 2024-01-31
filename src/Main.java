import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        greeter.getName();
        greeter.getAge();
        for (int i = 0; i < 4; i++) {
            greeter.getThingGrateFulFor();
        }
        greeter.sayGreeting();
    }
}