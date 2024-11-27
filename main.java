

import java.util.Scanner; // Scanner class ko import karte hain

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner ka object banate hain
        System.out.print("Enter a number: "); // User se input lene ke liye prompt
        int number = scanner.nextInt(); // User se number input lete hain
        System.out.println("You entered: " + number); // User ne jo number diya hai, wo print karte hain
    }
}
