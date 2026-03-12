/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounts;

public abstract class Account {
    public String name;
    private String accountNumber;
    private int balance;
    
    public Account(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void checkBalance() {
        System.out.println("Your balance is: Rp. " + balance);
    }
    
    public abstract void behaviorType();
}
