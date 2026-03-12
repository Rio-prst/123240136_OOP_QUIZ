/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import exception.UnderageException;

public class User {
    public String name;
    private String nik;
    public int age;
    public boolean isVerified;
    
    public User(String name, String nik, int age) {
        this.name = name;
        this.nik = nik;
        this.age = age;
        this.isVerified = false;
    }
    
    public void setNik(String nik) {
        this.name = nik;
    }
    
    public String getNik() {
        return nik;
    }
}
