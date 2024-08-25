import java.util.Scanner;

public class billingsys {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter price: ");
        float price = scanner.nextFloat();
        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        
    
        float total = price * quantity;
        System.out.println("The total amount is: " + total);
        
    
        System.out.print("Enter cash: ");
        float cash = scanner.nextFloat();
        
        float change = cash - total;
        System.out.println("Your change is: " + change);
        
        scanner.close();
    }
}
