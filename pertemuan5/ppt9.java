package com.company;

public class ppt9 {
    public static void main(String[]args){
        Student myobj=new Student();
        System.out.println("Name: "+myobj.fname);
        System.out.println("Age: "+myobj.age);
        System.out.println("Graduatin year: " + myobj.graduationYear);
        myobj.study();
    }
}
