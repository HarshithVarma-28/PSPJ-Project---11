import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        double balance = 1000.00; 
        
        
        int choice;
        
        
        do {
            
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            
            choice = scanner.nextInt();
            
            
            switch (choice) {
                
                
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;
                
            
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double deposit = scanner.nextDouble();
                    
        
                    if (deposit > 0) {
                        balance = balance + deposit;  
                        System.out.println("Successfully deposited $" + deposit);
                        System.out.println("New balance: $" + balance);
                    } else {
                        System.out.println("Invalid amount! Please enter a positive number.");
                    }
                    break;
        
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdraw = scanner.nextDouble();
                    
                    
                    if (withdraw <= 0) {
                        System.out.println("Invalid amount! Please enter a positive number.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds! Your balance is $" + balance);
                    } else {
                        balance = balance - withdraw;  
                        System.out.println("Successfully withdrew $" + withdraw);
                        System.out.println("Remaining balance: $" + balance);
                    }
                    break;
                
                
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                
                
                default:
                    System.out.println("Invalid choice! Please enter a number between 1-4.");
            }
            
        }  while (choice != 4);
        
    
        scanner.close();
    }
}
