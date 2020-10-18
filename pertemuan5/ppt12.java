package com.company;

public class ppt12 {
    int modelYear;
    String modelName;
    public ppt12(int year,String name){
        modelYear=year;
        modelName=name;
    }
    public static void main(String[]args){
        ppt12 mycar=new ppt12(1969,"mustang");
        System.out.println(mycar.modelYear+ " "+mycar.modelName);
    }
}
