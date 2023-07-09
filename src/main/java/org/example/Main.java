package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String name = sc.nextLine();
        //String password = sc.nextLine();
        //String service = sc.nextLine();



        Credential usr = new Credential(sc.nextLine(), sc.nextLine(), sc.nextLine());
        //Keys key = new Keys();

        //usr.setName(sc.nextLine());
        //usr.setPassword(sc.nextLine());
        //usr.setService(sc.nextLine());

        System.out.println("User is: " + usr.getName());
        System.out.println("Password is: " + usr.getPassword());
        System.out.println("Service is: " + usr.getService());
        usr.encryptPassword();
    }
}