import java.util.Scanner;
public class Greeter {
    public String users_name = "";
    public int users_age = -1;
    Scanner scanner = new Scanner(System.in);

    public void getName() {
        System.out.print("Enter your name: ");
        users_name = scanner.next();
    }

    public void getAge() {
        System.out.print("Enter your age: ");
        users_age = scanner.nextInt();
    }
    public void sayGreeting(){
        if (users_name.isEmpty()) {
            System.out.println("You have not provided a name yet!");
            return;
        }

        if (users_age == -1) {
            System.out.println("You have not provided an age yet!");
            return;
        }

        System.out.printf("Hello %s, you are %s years old!%n", users_name, users_age);
        scanner.close();
    }
}
