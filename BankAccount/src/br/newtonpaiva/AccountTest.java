/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva;

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class AccountTest {
    public static void main(String[] args){
        // Declarando as variáveis, Scanner
        String name;
        double balance = 5;
        
        Scanner input = new Scanner(System.in);
        
        Account myAccount = new Account();
                
        //Obtendo os dados iniciais do Cliente
        System.out.printf("Sign up for a new client is: %s%n%n", myAccount.getName());
        
        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();
        
        System.out.printf("Value initial amount deposited in the account: ");
        myAccount.deposit(balance);
    }
}