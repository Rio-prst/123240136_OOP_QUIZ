/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import accounts.SavingsAccount;
import exception.UnderageException;
import java.util.Scanner;

public class CreateNewAccount {
    
    public CreateNewAccount() throws UnderageException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Create new Account ===");
        System.out.println("Account type:");
        System.out.println("1. Savings");
        System.out.println("2. Investment");
        System.out.println("3. FX (Foreign Currency");
        System.out.println("choose: ");
        int selectMenu = scanner.nextInt();
        
        switch(selectMenu) {
            case 1:
                System.out.println("===SPENT DIGITAL - CREATE NEW ACCOUNT===");
                System.out.println("NIK: ");
                String inputNik = scanner.nextLine();
                System.out.println("Full Name: ");
                String inputName = scanner.nextLine();
                System.out.println("Age: ");
                int inputAge = scanner.nextInt();
                scanner.close();
                
                System.out.println("String: " + inputNik);
                
                if (inputAge <= 17) {
                    throw new UnderageException("Can't regoster, your age is under 17");
                } else {
                    System.out.println("Create account success");
                    SavingsAccount savingsAccount1 = new SavingsAccount(inputName, inputName, inputAge);
                }       
        }
    }
}
