/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banksystem;
import exception.UnderageException;
import java.util.Scanner;
import services.CreateNewAccount;

public class BankSystem {

    public static void main(String[] args) throws UnderageException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===SPENT DIGITAL===");
        System.out.println("1. Make deposit");
        System.out.println("2. Withdraw money");
        System.out.println("3. Create new account");
        System.out.println("4. Transfer money");
        
        System.out.println("Select: ");
        int selectMenu = scanner.nextInt();
        
        switch(selectMenu) {
            case 1:
                
            case 3:
                CreateNewAccount newAccount = new CreateNewAccount();
                break;
        }
    }
    
}
