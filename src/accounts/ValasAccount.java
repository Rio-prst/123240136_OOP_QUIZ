/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounts;

public class ValasAccount extends Account {

    public ValasAccount(String name, String accountNumber, int balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public void behaviorType() {
        System.out.println("Support ATM linkage and cash withdrawls");
    }
    
}
