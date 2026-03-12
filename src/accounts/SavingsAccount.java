/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounts;

public class SavingsAccount extends Account {
    
    public SavingsAccount(String name, String accountNumber, int balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public void behaviorType() {
        System.out.println("Specialized for long-term wealth growth");
    }

    @Override
    public int minInitialDeposit() {
        return 50000;
    }
    
}
