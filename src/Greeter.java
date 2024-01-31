import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Greeter {
    private String users_name = "";
    private int users_age = -1;
    private final List<String> gratefulList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void getName() {
        System.out.print("Enter your name: ");
        users_name = scanner.next();
    }

    public void getAge() {
        System.out.print("Enter your age: ");
        users_age = scanner.nextInt();
    }

    public void addThingGratefulFor(String thing) {
        if (!thing.isBlank()) {
            gratefulList.add(thing);
        }
    }

    public void getThingGrateFulFor() {
        if (gratefulList.isEmpty()) {
            System.out.print("Enter something you're grateful for: ");
            String thingGratefulFor = scanner.next();
            this.addThingGratefulFor(thingGratefulFor);
        } else if (gratefulList.size() >= 3) {
            System.out.println("You cannot add anymore thing's for today.");
        } else {
            System.out.print("Enter another thing you're grateful for: ");
            String thingGratefulFor = scanner.next();
            this.addThingGratefulFor(thingGratefulFor);
        }
    }
    public void sayGreeting() {
        if (users_name.isEmpty()) {
            System.out.println("You have not provided a name yet!");
            return;
        }

        if (users_age == -1) {
            System.out.println("You have not provided an age yet!");
            return;
        }

        if(gratefulList.size() < 3) {
            System.out.println("You're not grateful enough boy!!");
            return;
        }

        System.out.printf("Hello %s, you are %s years old!%n", users_name, users_age);
        System.out.println("Here's what you're grateful for today: ");
        System.out.printf("1. %s%n", this.gratefulList.get(0));
        System.out.printf("2. %s%n", this.gratefulList.get(1));
        System.out.printf("3. %s%n", this.gratefulList.get(2));
        scanner.close();
    }
}
