/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva;

/**
 *
 * @author Adriano
 */
public class Account {
    private String name; //variavel de instância
    private double balance;
    private double saldo;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double valor)
    {   saldo += valor;
        System.out.println("Deposited: " + valor);
    }    
    

}
