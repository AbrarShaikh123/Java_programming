import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Scanner object banaya input read karne ke liye
        Scanner scanner = new Scanner(System.in);

        // String input read karna
        System.out.print("Apna naam daaliye: ");
        String name = scanner.nextLine();

        // Integer input read karna
        System.out.print("Apni age daaliye: ");
        int age = scanner.nextInt();

        // Float input read karna
        System.out.print("Apni height meters mein daaliye: ");
        float height = scanner.nextFloat();

        // Inputs ko display karna
        System.out.println("Naam: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");

        // Scanner ko close karna
        scanner.close();
    }
}
