/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounts;

public class InvesmentAccount extends Account {
    
    public InvesmentAccount(String name, String accountNumber, int balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public void behaviorType() {
        System.out.println("Flexible account (support all transactions)");
    }
    
}
