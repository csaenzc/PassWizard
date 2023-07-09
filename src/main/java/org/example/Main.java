package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Credential usr = new Credential();
        Encryptor enc = new Encryptor();
        //Keys key = new Keys();

        usr.setName(sc.nextLine());
        usr.setPassword(sc.nextLine());
        usr.setService(sc.nextLine());
        //enc.setPassword(sc.nextLine());
        enc.encryptPass(usr.getPassword());

        System.out.println("User is: " + usr.getName());
        System.out.println("Password is: " + usr.getPassword());
        System.out.println("Service is: " + usr.getService());
        System.out.println("Encrypted password is: " + enc.encryptPass(usr.getPassword()));
    }
}