package com.company;

abstract class ppt8{
        public String fname="john";
        public int age=24;
        public abstract void study();
    }
    class Student extends ppt8{
        public int graduationYear=2018;
        public void study(){
            System.out.println("Studying all day along");
        }
}
