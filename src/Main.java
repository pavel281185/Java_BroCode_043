import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("Write dog or cat: ");
        String choice = scanner.nextLine();

        if (choice.equals("dog")){
            animal = new Dog();
            animal.speak();
        } else if (choice.equals("cat")) {
            animal = new Cat();
            animal.speak();
        }else {
            animal = new Animal();
            System.out.println("Invalid choice");
            animal.speak();
        }
    }
}