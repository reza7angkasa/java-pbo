package com.company;
import java.util.*;

public class tugas {
 static int dicari(int A[],int cari){
        for(int i=0; i<A.length; i++){
            if(A[i]==cari){
                return i;
            }
        }
        return -1;
    }

    public static void main (String []   args) {
        String username1 = "AngkasaGanteng";
        String password1 = "4ngk454";

        Scanner cc = new Scanner(System.in);
        int A[] = new int[2];
        for (int i = 0; i < A.length; i++) {
            System.out.print("Username: ");
            String username = cc.nextLine();
            System.out.print("Password: ");
            String password = cc.nextLine();
            if ((username.equals(username1)) && (password.equals(password1))) {
                System.out.println("Loggin Success");
                System.exit(0);
            } else {
                System.out.println("Try Again");
            }
        }
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
