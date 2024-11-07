package com;

public class Main {
    public static void main(String[] args) {
        // Membuat objek ATM 
        ATM atm = new ATM("Jakarta"); 

        //Membuat objek BankAccount melalui objek ATM 
        ATM.BankAccout accout = atm.new BankAccout("0011223344"); 

        // Menampilkan saldo awal 
        accout.displayAccountInfo();

        // Melakukan deposit 
        accout.deposit(1000000);
        accout.displayAccountInfo(); 

        // Melakukan withdraw 
        accout.withdraw(500000);
        accout.displayAccountInfo();
    }    
}
