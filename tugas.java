package com.company;
import java.util.*;

public class tugas {
    public static void main(String[] args) {

        String username1 = "AngkasaGanteng";
        String password1 = "4ngk454";
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            if ((username.equals(username1)) && (password.equals(password1))) {
                System.out.println("Loggin Success");
                System.exit(0);
            } else {
                System.out.println("Try Again");
            }}
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            if ((username.equals(username1)) && (password.equals(password1))) {
                System.out.println("Loggin Success");
                System.exit(0);
            }else{
                System.out.println("Try Again");
            }}
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        if ((username.equals(username1)) && (password.equals(password1))) {
            System.out.println("Loggin Success");
            System.exit(0);
        }else{
            System.out.println("You Have Been Blocked");
        }
    }
}
